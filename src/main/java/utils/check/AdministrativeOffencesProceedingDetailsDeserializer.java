package utils.check;

import com.google.gson.*;
import models.checks.courts.AdministrativeOffencesProceedingDetails;

import java.lang.reflect.Type;

public class AdministrativeOffencesProceedingDetailsDeserializer implements JsonDeserializer<AdministrativeOffencesProceedingDetails> {
    @Override
    public AdministrativeOffencesProceedingDetails deserialize(JsonElement jsonElement, Type type,
                              JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject object = jsonElement.getAsJsonObject();
        AdministrativeOffencesProceedingDetails administrativeOffencesProceedingDetails =
                new AdministrativeOffencesProceedingDetails();
        if (object.has("protocolNumber")) {
            administrativeOffencesProceedingDetails.
                    setProtocolNumber(object.get("protocolNumber").getAsString());
        } else {
            administrativeOffencesProceedingDetails.setProtocolNumber("");
        }
        return administrativeOffencesProceedingDetails;
    }
}
