package utils.check;

import com.google.gson.*;
import models.checks.Analytics;

import java.lang.reflect.Type;

public class AnalyticsDeserializer implements JsonDeserializer<Analytics> {
    @Override
    public Analytics deserialize(JsonElement jsonElement, Type type,
                                 JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        Analytics analytics = new Analytics();
        JsonObject object = jsonElement.getAsJsonObject();
        analytics.setName(object.get("name").getAsString());
        analytics.setCount(object.get("count").getAsString());
        if (object.has("sum")) {
            analytics.setSum(object.get("sum").getAsString());
        } else {
            analytics.setSum("");
        }
        return analytics;
    }
}
