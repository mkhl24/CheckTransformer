package utils.check;

import com.google.gson.*;
import models.checks.arbitration.ArbitrationCheck;
import models.checks.arbitration.ArbitrationCheckResult;

import java.lang.reflect.Type;

public class ArbitrationCheckDeserializer implements JsonDeserializer<ArbitrationCheck> {
    @Override
    public ArbitrationCheck deserialize(JsonElement jsonElement, Type type,
                                        JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        ArbitrationCheck arbitrationCheck = new ArbitrationCheck();
        JsonObject object = jsonElement.getAsJsonObject();
        object = object.getAsJsonObject("bankruptcy");
        arbitrationCheck.setSubjectId(object.get("subjectId").getAsString());
        arbitrationCheck.setAcResult(jsonDeserializationContext.
                deserialize(object.get("result"), ArbitrationCheckResult.class));

        return arbitrationCheck;
    }
}
