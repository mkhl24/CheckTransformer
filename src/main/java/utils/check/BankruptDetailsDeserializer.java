package utils.check;

import com.google.gson.*;
import models.checks.bankruptcy.BankruptDetails;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class BankruptDetailsDeserializer implements JsonDeserializer<BankruptDetails> {
    @Override
    public BankruptDetails deserialize(JsonElement jsonElement, Type type,
                                       JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        BankruptDetails details = new BankruptDetails();
        JsonObject object = jsonElement.getAsJsonObject();
        details.setName(object.get("name").getAsString());
        if (object.has("inn")) {
            details.setInn(object.get("name").getAsString());
        } else {
            details.setInn("");
        }
        if (object.has("snils")) {
            details.setSnils(object.get("snils").getAsString());
        } else {
            details.setSnils("");
        }
        if (object.has("dateBirth")) {
            details.setDateBirth(jsonDeserializationContext.
                    deserialize(object.get("dateBirth"), LocalDate.class));
        }

        return details;
    }
}
