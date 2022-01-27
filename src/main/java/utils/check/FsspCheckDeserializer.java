package utils.check;

import com.google.gson.*;
import models.checks.Analytics;
import models.checks.fssp.EnforcementProceeding;
import models.checks.fssp.FsspCheck;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class FsspCheckDeserializer implements JsonDeserializer<FsspCheck> {
    @Override
    public FsspCheck deserialize(JsonElement jsonElement, Type type,
                                 JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {

        FsspCheck fsspCheck = new FsspCheck();
        JsonObject jsonObject = jsonElement.getAsJsonObject();

        JsonObject fsspCheckObject = jsonObject.getAsJsonObject("fssp");
        fsspCheck.setSubjectId(fsspCheckObject.get("subjectId").getAsString());

        if (fsspCheckObject.has("regions")) {
            JsonArray fsspCheckRegions = fsspCheckObject.getAsJsonArray("regions");
            for (JsonElement region : fsspCheckRegions) {
                if (region.isJsonPrimitive()) {
                    fsspCheck.addRegion(region.getAsString());
                }
            }
        }

        if (fsspCheckObject.has("result")) {
            JsonObject resultObject = fsspCheckObject.getAsJsonObject("result");
            JsonArray proceedings =
                    resultObject.getAsJsonArray("proceedings");
            if (proceedings.size() != 0) {
                for (JsonElement proceeding : proceedings) {
                    JsonObject fsspProceeding = proceeding.getAsJsonObject();
                    EnforcementProceeding enforcementProceeding = new EnforcementProceeding();
                    enforcementProceeding.setNumber(fsspProceeding.get("number").getAsString());

                    enforcementProceeding.setStartDate(jsonDeserializationContext.
                            deserialize(fsspProceeding.get("startDate"), LocalDate.class));
                    if (fsspProceeding.has("endDate")) {
                        enforcementProceeding.setEndDate(jsonDeserializationContext.
                                deserialize(fsspProceeding.get("endDate"), LocalDate.class));
                    } else {
                        enforcementProceeding.setEndDate(LocalDate.now());
                    }
                    if (fsspProceeding.has("endReason")) {
                        enforcementProceeding.setEndReason(fsspProceeding.get("endReason").getAsString());
                    } else {
                        enforcementProceeding.setEndReason("");
                    }
                    enforcementProceeding.setSubjectDescription(fsspProceeding.get("subject").getAsString());
                    enforcementProceeding.setRegion(fsspProceeding.get("region").getAsString());
                    enforcementProceeding.setEnforcement(fsspProceeding.get("enforcement").getAsString());
                    if (fsspProceeding.has("sum")) {
                        enforcementProceeding.setSum(fsspProceeding.get("sum").getAsString());
                    } else {
                        enforcementProceeding.setSum("");
                    }
                    enforcementProceeding.setDocument(fsspProceeding.get("document").getAsString());
                    enforcementProceeding.setDepartment(fsspProceeding.get("department").getAsString());

                    fsspCheck.addEnforcementProceeding(enforcementProceeding);
                }
            }

            JsonArray resultAnalytics = resultObject.getAsJsonArray("groupByEnforcement");
            if (resultAnalytics.size() != 0) {
                for (JsonElement element :resultAnalytics) {
                    fsspCheck.addByEnforcementAnalytics(jsonDeserializationContext.
                            deserialize(element, Analytics.class));
                }
            }
        }

        return fsspCheck;
    }
}
