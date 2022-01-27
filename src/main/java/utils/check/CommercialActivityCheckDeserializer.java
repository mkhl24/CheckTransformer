package utils.check;

import com.google.gson.*;
import models.checks.commercialactivity.CommercialActivityCheck;
import models.checks.commercialactivity.InvolvedOrganization;

import java.lang.reflect.Type;

public class CommercialActivityCheckDeserializer implements JsonDeserializer<CommercialActivityCheck> {
    @Override
    public CommercialActivityCheck deserialize(JsonElement jsonElement, Type type,
                                               JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        CommercialActivityCheck commercialActivityCheck =
                new CommercialActivityCheck();
        JsonObject object = jsonElement.getAsJsonObject();
        JsonObject comActObject = object.getAsJsonObject("commercialActivity");
        commercialActivityCheck.setSubjectId(comActObject.get("subjectId").getAsString());
        if (comActObject.has("result")) {
            JsonArray organizations = comActObject.getAsJsonObject("result").
                    getAsJsonArray("involvedOrganizations");
            if (organizations.size() != 0) {
                for (JsonElement element : organizations) {
                    commercialActivityCheck.addOrganization(jsonDeserializationContext.
                            deserialize(element, InvolvedOrganization.class));
                }
            }
        }
        return commercialActivityCheck;
    }
}
