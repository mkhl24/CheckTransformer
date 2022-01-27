package utils.check;

import com.google.gson.*;
import models.checks.commercialactivity.OrganizationActivity;

import java.lang.reflect.Type;

public class OrganizationActivityDeserializer implements JsonDeserializer<OrganizationActivity> {
    @Override
    public OrganizationActivity deserialize(JsonElement jsonElement, Type type,
                                            JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        OrganizationActivity activity = new OrganizationActivity();
        JsonObject object = jsonElement.getAsJsonObject();
        activity.setActivityCode(object.get("code").getAsString());
        activity.setActivityName(object.get("name").getAsString());
        return activity;
    }
}
