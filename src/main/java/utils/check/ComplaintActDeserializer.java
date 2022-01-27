package utils.check;

import com.google.gson.*;
import models.checks.courts.ComplaintAct;
import models.checks.Participant;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class ComplaintActDeserializer implements JsonDeserializer<ComplaintAct> {
    @Override
    public ComplaintAct deserialize(JsonElement jsonElement, Type type,
                                    JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        ComplaintAct act = new ComplaintAct();
        JsonObject object = jsonElement.getAsJsonObject();

        if (object.has("receiptDate")) {
            act.setReceiptDate(jsonDeserializationContext.
                            deserialize(object.get("receiptDate"), LocalDate.class));
        }
        if (object.has("startDate")) {
            act.setStartDate(jsonDeserializationContext.
                    deserialize(object.get("startDate"), LocalDate.class));
        }
        if (object.has("endDate")) {
            act.setEndDate(jsonDeserializationContext.
                    deserialize(object.get("endDate"), LocalDate.class));
        }
        if (object.has("result")) {
            act.setResult(object.get("result").getAsString());
        } else {
            act.setResult("");
        }
        if (object.has("certiorari")) {
            act.setCertiorari(object.get("certiorari").getAsBoolean());
        }
        if (object.has("declarant")) {
            JsonObject declarant = object.getAsJsonObject("declarant");
            act.setDeclarant(jsonDeserializationContext.
                    deserialize(declarant, Participant.class));
        }

        return act;
    }
}
