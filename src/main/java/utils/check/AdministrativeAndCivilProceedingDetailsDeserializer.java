package utils.check;

import com.google.gson.*;
import models.checks.courts.AdministrativeAndCivilProceedingDetails;

import java.lang.reflect.Type;

public class AdministrativeAndCivilProceedingDetailsDeserializer implements JsonDeserializer<AdministrativeAndCivilProceedingDetails> {
    @Override
    public AdministrativeAndCivilProceedingDetails deserialize(JsonElement jsonElement, Type type,
                              JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

        JsonObject jsonObject = jsonElement.getAsJsonObject();
        AdministrativeAndCivilProceedingDetails administrativeAndCivilProceedingDetails =
                new AdministrativeAndCivilProceedingDetails();

        if (jsonObject.has("proceedingCategory")) {
            administrativeAndCivilProceedingDetails.setProceedingCategory(
                    jsonObject.get("proceedingCategory").getAsString());
        } else {
            administrativeAndCivilProceedingDetails.setProceedingCategory("");
        }

        return administrativeAndCivilProceedingDetails;
    }
}
