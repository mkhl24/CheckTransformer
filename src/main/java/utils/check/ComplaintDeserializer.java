package utils.check;

import com.google.gson.*;
import models.checks.courts.Complaint;
import models.checks.courts.FirstInstance;

import java.lang.reflect.Type;

public class ComplaintDeserializer implements JsonDeserializer<Complaint> {
    @Override
    public Complaint deserialize(JsonElement jsonElement, Type type,
                                 JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        JsonObject object = jsonElement.getAsJsonObject();
        Complaint complaint = new Complaint();
        if (object.has("firstInstance")) {
            complaint.setFirstInstance(jsonDeserializationContext
                    .deserialize(object.getAsJsonObject("firstInstance"), FirstInstance.class));
        }
        return complaint;
    }
}
