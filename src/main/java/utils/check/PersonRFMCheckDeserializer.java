package utils.check;

import com.google.gson.*;
import models.checks.rosfinmonitoring.PersonRFMCheck;
import models.checks.rosfinmonitoring.PersonTerroristResult;

import java.lang.reflect.Type;

public class PersonRFMCheckDeserializer implements JsonDeserializer<PersonRFMCheck> {
    @Override
    public PersonRFMCheck deserialize(JsonElement jsonElement, Type type,
                                      JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        PersonRFMCheck check = new PersonRFMCheck();
        JsonObject object = jsonElement.getAsJsonObject();

        JsonObject distributorsWMDObject = object.getAsJsonObject("distributorsWMD");
        check.setDistributorWMD(distributorsWMDObject.get("found").getAsBoolean());

        JsonObject terroristObject = object.getAsJsonObject("terrorist");
        JsonArray foundTerroristItems = terroristObject.getAsJsonArray("foundItems");

        if (foundTerroristItems.size() != 0) {
            for (JsonElement item : foundTerroristItems) {
                check.addPersonTerroristResult(jsonDeserializationContext.
                        deserialize(item, PersonTerroristResult.class));
            }
        }

        return check;
    }
}
