package utils.check;

import com.google.gson.*;
import models.checks.PassportCheck;

import java.lang.reflect.Type;

public class PassportCheckDeserializer implements JsonDeserializer<PassportCheck> {
    @Override
    public PassportCheck deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PassportCheck passportCheck = new PassportCheck();
        JsonObject object = jsonElement.getAsJsonObject();
        JsonObject passportObject = object.getAsJsonObject("passport");
        passportCheck.setSubjectId(passportObject.get("subjectId").getAsString());
        if (passportObject.has("result")) {
            passportCheck.setPassportState(passportObject.getAsJsonObject("result")
                    .get("state").getAsString());
        } else {
            passportCheck.setPassportState("n/a");
        }

        return passportCheck;
    }
}
