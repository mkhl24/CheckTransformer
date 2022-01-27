package utils.check;

import com.google.gson.*;
import models.checks.Analytics;
import models.checks.arbitration.ArbitrationCheckResult;
import models.checks.arbitration.ArbitrationProceeding;

import java.lang.reflect.Type;

public class ArbitrationCheckResultDeserializer implements JsonDeserializer<ArbitrationCheckResult> {
    @Override
    public ArbitrationCheckResult deserialize(JsonElement jsonElement, Type type,
                                              JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        ArbitrationCheckResult arbitrationCheck = new ArbitrationCheckResult();
        JsonObject arbitrationObject = jsonElement.getAsJsonObject();

        arbitrationCheck.setCount(arbitrationObject.get("count").getAsInt());
        arbitrationCheck.setSum(arbitrationObject.get("sum").getAsDouble());

        JsonArray byResultArray = arbitrationObject.getAsJsonArray("groupByResult");
        for (JsonElement element : byResultArray) {
            arbitrationCheck.addGroupByResultElement(jsonDeserializationContext.
                    deserialize(element, Analytics.class));
        }

        JsonArray byCategoryArray = arbitrationObject.getAsJsonArray("groupByCategory");
        for (JsonElement element : byCategoryArray) {
            arbitrationCheck.addGroupByCategoryElement(jsonDeserializationContext.
                    deserialize(element, Analytics.class));
        }

        JsonArray proceedingsArray = arbitrationObject.getAsJsonArray("proceedings");
        for (JsonElement element : proceedingsArray) {
            arbitrationCheck.addProceeding(jsonDeserializationContext.
                    deserialize(element, ArbitrationProceeding.class));
        }


        return arbitrationCheck;
    }
}
