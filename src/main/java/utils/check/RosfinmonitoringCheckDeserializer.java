package utils.check;

import com.google.gson.*;
import models.checks.rosfinmonitoring.PersonRFMCheck;
import models.checks.rosfinmonitoring.RosfinmonitoringCheck;

import java.lang.reflect.Type;

public class RosfinmonitoringCheckDeserializer implements JsonDeserializer<RosfinmonitoringCheck> {
    @Override
    public RosfinmonitoringCheck deserialize(JsonElement jsonElement, Type type,
                                             JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        RosfinmonitoringCheck check = new RosfinmonitoringCheck();
        JsonObject object = jsonElement.getAsJsonObject();
        JsonObject rfmCheck = object.get("rosfinmonitoring").getAsJsonObject();
        check.setSubjectId(rfmCheck.get("subjectId").getAsString());
        JsonObject rfmCheckResult = rfmCheck.getAsJsonObject("result");

        if (rfmCheckResult.has("person")) {
            JsonObject rfmPersonCheck = rfmCheckResult.getAsJsonObject("person");
            check.setPersonCheck(jsonDeserializationContext.
                    deserialize(rfmPersonCheck, PersonRFMCheck.class));
        }

        return check;
    }
}
