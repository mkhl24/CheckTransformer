package utils.check;

import com.google.gson.*;
import models.checks.courts.Appeal;
import models.checks.courts.FirstInstance;

import java.lang.reflect.Type;

public class AppealDeserializer implements JsonDeserializer<Appeal> {
    @Override
    public Appeal deserialize(JsonElement jsonElement, Type type,
                              JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        Appeal appeal = new Appeal();
        JsonObject object = jsonElement.getAsJsonObject();
        if (object.has("firstInstance")) {
            appeal.setFirstInstance(jsonDeserializationContext
                    .deserialize(object.getAsJsonObject("firstInstance"), FirstInstance.class));
        }

        return appeal;
    }
}
