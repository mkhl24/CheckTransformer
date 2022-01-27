package utils.check;

import com.google.gson.*;
import models.checks.PowerOfAttorneyCheck;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class PowerOfAttorneyCheckDeserializer implements JsonDeserializer<PowerOfAttorneyCheck> {
    @Override
    public PowerOfAttorneyCheck deserialize(JsonElement jsonElement, Type type,
                                            JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        PowerOfAttorneyCheck poaCheck = new PowerOfAttorneyCheck();
        JsonObject object = jsonElement.getAsJsonObject().
                getAsJsonObject("powerOfAttorney");
        poaCheck.setNumber(object.get("number").getAsString());
        poaCheck.setDate(jsonDeserializationContext.
                deserialize(object.get("date"), LocalDate.class));
        poaCheck.setIssuerType(object.get("issuerType").getAsString());
        if (object.has("notaryId")) {
            poaCheck.setNotaryId(object.get("notaryId").getAsString());
        } else {
            poaCheck.setNotaryId("");
        }
        if (object.has("issuerFio")) {
            poaCheck.setIssuerFio(object.get("issuerFio").getAsString());
        } else {
            poaCheck.setIssuerFio("");
        }
        if (object.has("issuerRegion")) {
            poaCheck.setIssuerRegion(object.get("issuerRegion").getAsString());
        } else {
            poaCheck.setIssuerRegion("");
        }
        if (object.has("issuerCountry")) {
            poaCheck.setIssuerCountry(object.get("issuerCountry").getAsString());
        } else {
            poaCheck.setIssuerCountry("");
        }

        object = object.getAsJsonObject("result");
        poaCheck.setAttorneyState(object.get("state").getAsString());
        poaCheck.setAttorneyDescription(object.get("description").getAsString());


        return poaCheck;
    }
}
