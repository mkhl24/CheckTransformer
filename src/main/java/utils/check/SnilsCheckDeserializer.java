package utils.check;

import com.google.gson.*;
import models.checks.SnilsCheck;

import java.lang.reflect.Type;

public class SnilsCheckDeserializer implements JsonDeserializer<SnilsCheck> {
    @Override
    public SnilsCheck deserialize(JsonElement jsonElement, Type type,
                                  JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        SnilsCheck snilsCheck = new SnilsCheck();
        JsonObject object = jsonElement.getAsJsonObject();
        snilsCheck.setSubjectId(object.get("subjectId").getAsString());
        if (object.has("result")) {
            snilsCheck.setResultState(object.getAsJsonObject("result").
                    get("state").getAsString());
        } else {
            snilsCheck.setResultState("n/a");
        }
        return snilsCheck;
    }
}
