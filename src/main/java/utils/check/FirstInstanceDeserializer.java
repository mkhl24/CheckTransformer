package utils.check;

import com.google.gson.*;
import models.checks.courts.FirstInstance;

import java.lang.reflect.Type;

public class FirstInstanceDeserializer implements JsonDeserializer<FirstInstance> {
    @Override
    public FirstInstance deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject object = jsonElement.getAsJsonObject();
        FirstInstance firstInstance = new FirstInstance();

        if (object.has("number")) {
            firstInstance.setNumber(object.get("number").getAsString());
        } else {
            firstInstance.setNumber("");
        }
        if (object.has("courtName")) {
            firstInstance.setCourtName(object.get("courtName").getAsString());
        }
        return firstInstance;
    }
}
