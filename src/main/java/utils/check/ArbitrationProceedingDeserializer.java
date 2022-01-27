package utils.check;

import com.google.gson.*;
import models.checks.Participant;
import models.checks.arbitration.ArbitrationProceeding;
import models.checks.arbitration.ArbitrationProceedingInstance;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class ArbitrationProceedingDeserializer implements JsonDeserializer<ArbitrationProceeding> {
    @Override
    public ArbitrationProceeding deserialize(JsonElement jsonElement, Type type,
                                             JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        ArbitrationProceeding proceeding = new ArbitrationProceeding();
        JsonObject object = jsonElement.getAsJsonObject();

        proceeding.setNumber(object.get("number").getAsString());
        if (object.has("proceedingType")) {
            proceeding.setProceedingType(object.get("proceedingType").getAsString());
        } else {
            proceeding.setProceedingType("");
        }
        if (object.has("proceedingCategory")) {
            proceeding.setProceedingCategory(object.get("proceedingCategory").getAsString());
        } else {
            proceeding.setProceedingCategory("");
        }
        if (object.has("proceedingStartDate")) {
            proceeding.setProceedingStartDate(jsonDeserializationContext.
                    deserialize(object.get("proceedingStartDate"), LocalDate.class));
        }
        if (object.has("sum")) {
            proceeding.setSum(object.get("sum").getAsString());
        } else {
            proceeding.setSum("");
        }

        JsonArray participantsArray = object.getAsJsonArray("participants");
        if (participantsArray.size() != 0) {
            for (JsonElement element : participantsArray) {
                proceeding.addParticipants(jsonDeserializationContext.
                        deserialize(element, Participant.class));
            }
        }

        if (object.has("instances")) {
            JsonArray instancesArray = object.getAsJsonArray("instances");
            for (JsonElement element : instancesArray) {
                proceeding.addArbitrationProceedingInstance(jsonDeserializationContext.
                        deserialize(element, ArbitrationProceedingInstance.class));
            }
        }
        proceeding.setProceedingResult(object.get("proceedingResult").getAsString());

        return proceeding;
    }
}
