package utils.check;

import com.google.gson.*;
import models.checks.rosfinmonitoring.PersonTerroristResult;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class PersonTerroristResultDeserializer implements JsonDeserializer<PersonTerroristResult> {
    @Override
    public PersonTerroristResult deserialize(JsonElement jsonElement, Type type,
                                             JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        PersonTerroristResult result = new PersonTerroristResult();
        JsonObject object = jsonElement.getAsJsonObject();

        result.setFio(object.get("fio").getAsString());
        if (object.has("birthDate")) {
            result.setBirthDate(jsonDeserializationContext.
                    deserialize(object.get("birthDate"), LocalDate.class));
        }
        if (object.has("birthPlace")) {
            result.setBirthPlace(object.get("birthPlace").getAsString());
        } else {
            result.setBirthPlace("");
        }
        result.setTerroristState(object.get("terroristState").getAsString());
        result.setFoundBy(object.get("foundBy").getAsString());
        return result;
    }
}
