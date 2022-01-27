package utils.check;

import com.google.gson.*;
import models.checks.bankruptcy.BankruptDetails;
import models.checks.bankruptcy.BankruptcyProceeding;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class BankruptcyProceedingDeserializer implements JsonDeserializer<BankruptcyProceeding> {
    @Override
    public BankruptcyProceeding deserialize(JsonElement jsonElement, Type type,
                                            JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        BankruptcyProceeding proceeding = new BankruptcyProceeding();
        JsonObject object = jsonElement.getAsJsonObject();
        if (object.has("number")) {
            proceeding.setNumber(object.get("number").getAsString());
        } else {
            proceeding.setNumber("");
        }
        if (object.has("date")) {
            proceeding.setDate(jsonDeserializationContext.
                    deserialize(object.get("date"), LocalDate.class));
        }
        proceeding.setState(object.get("state").getAsString());
        if (object.has("lastMessageDate")) {
            proceeding.setDate(jsonDeserializationContext.
                    deserialize(object.get("lastMessageDate"), LocalDate.class));
        }
        if (object.has("bankruptDetails")) {
            proceeding.setBankruptDetails(jsonDeserializationContext.
                    deserialize(object.get("bankruptDetails"), BankruptDetails.class));
        }

        return proceeding;
    }
}
