package utils.check;

import com.google.gson.*;
import models.checks.Participant;
import models.checks.courts.*;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class CourtCheckDeserializer implements JsonDeserializer<CourtCheck> {
    @Override
    public CourtCheck deserialize(JsonElement jsonElement, Type type,
                                  JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {

        CourtCheck courtCheck = new CourtCheck();
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonObject courtCheckObject = jsonObject.getAsJsonObject("courts");
        courtCheck.setSubjectId(courtCheckObject.get("subjectId").getAsString());
        JsonArray courtRegions = courtCheckObject.getAsJsonArray("regions");
        for (JsonElement region : courtRegions) {
            courtCheck.addRegion(region.getAsString());
        }

        if (courtCheckObject.has("result")) {
            JsonObject resultObject = courtCheckObject.getAsJsonObject("result");
            JsonArray proceedings =
                    resultObject.getAsJsonArray("proceedings");
            if (proceedings.size() != 0) {
                for (JsonElement proceeding : proceedings) {
                    JsonObject courts = proceeding.getAsJsonObject();
                    CourtProceeding tempCourtProceeding = new CourtProceeding();

                    tempCourtProceeding.setNumber(courts.get("number").getAsString());
                    tempCourtProceeding.setProceedingStartDate(jsonDeserializationContext.
                            deserialize(courts.get("startDate"), LocalDate.class));
                    tempCourtProceeding.setCourtName(courts.get("courtName").getAsString());
                    if (courts.has("judge")) {
                        tempCourtProceeding.setJudge(courts.get("judge").getAsString());
                    } else {
                        tempCourtProceeding.setJudge("");
                    }
                    tempCourtProceeding.setRegion(courts.get("region").getAsString());
                    tempCourtProceeding.setProceedingType(courts.get("proceedingType").getAsString());
                    if (courts.has("proceedingResult")) {
                        tempCourtProceeding.setProceedingResult(courts.get("proceedingResult").getAsString());
                    } else {
                        tempCourtProceeding.setProceedingResult("");
                    }

                    // - proceedingDetails - //
                    JsonObject details = courts.getAsJsonObject("proceedingDetails");
                    if (details.has("administrativeAndCivil")) {
                        tempCourtProceeding.setProceedingDetails(jsonDeserializationContext
                                .deserialize(details, AdministrativeAndCivilProceedingDetails.class));
                    } else if (details.has("administrativeOffences")) {
                        tempCourtProceeding.setProceedingDetails(jsonDeserializationContext
                                .deserialize(details, AdministrativeOffencesProceedingDetails.class));
                    } else if (details.has("materialsProceeding")) {
                        tempCourtProceeding.setProceedingDetails(jsonDeserializationContext
                                .deserialize(details, MaterialsProceedingDetails.class));
                    } else {
                        tempCourtProceeding.setProceedingDetails(new CriminalProceedingDetails());
                    }

                    // - participants - //
                    JsonArray participants = courts.
                            getAsJsonObject("participants").
                            getAsJsonArray("items");
                    if (participants.size() != 0) {
                        for (JsonElement element : participants) {
                            JsonObject  object = element.getAsJsonObject();
                            tempCourtProceeding.addParticipant(jsonDeserializationContext
                                    .deserialize(object, Participant.class));
                        }
                    }

                    // - discussionStage - //
                    JsonObject stage = courts.getAsJsonObject("discussionStage");
                    if (stage.has("firstInstance")) {
                        tempCourtProceeding.setDiscussionStage(jsonDeserializationContext.
                                deserialize(stage.get("firstInstance"), FirstInstance.class));
                    } else if (stage.has("supervision")) {
                        tempCourtProceeding.setDiscussionStage(jsonDeserializationContext.
                                deserialize(stage.get("supervision"), Supervision.class));
                    } else if (stage.has("cassation")) {
                        tempCourtProceeding.setDiscussionStage(jsonDeserializationContext.
                                deserialize(stage.get("cassation"), Cassation.class));
                    } else if (stage.has("appeal")) {
                        tempCourtProceeding.setDiscussionStage(jsonDeserializationContext.
                                deserialize(stage.get("appeal"), Appeal.class));
                    } else if (stage.has("complaint")) {
                        tempCourtProceeding.setDiscussionStage(jsonDeserializationContext.
                                deserialize(stage.get("complaint"), Complaint.class));
                    }

                    tempCourtProceeding.setProceedingURL(courts.get("proceedingUrl").getAsString());

                    courtCheck.addCourtProceeding(tempCourtProceeding);
                }
            }
        }
        return courtCheck;
    }
}