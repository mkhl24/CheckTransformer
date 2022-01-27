package utils.check;

import com.google.gson.*;
import models.checks.arbitration.ArbitrationProceedingInstance;
import models.checks.arbitration.InstanceDocument;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class ArbitrationProceedingInstanceDeserializer
        implements JsonDeserializer<ArbitrationProceedingInstance> {
    @Override
    public ArbitrationProceedingInstance deserialize(JsonElement jsonElement,
                                                     Type type,
                                                     JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        ArbitrationProceedingInstance instance = new ArbitrationProceedingInstance();
        JsonObject object = jsonElement.getAsJsonObject();
        if (object.has("receivedInstanceDate")) {
            instance.setReceivedInstanceDate(jsonDeserializationContext.
                    deserialize(object.get("receivedInstanceDate"), LocalDate.class));
        }
        instance.setInstanceType(object.get("instanceType").getAsString());

        if (object.has("documents")) {
            JsonArray documentArray = object.getAsJsonArray("documents");
            if (documentArray.size() != 0) {
                for (JsonElement element : documentArray) {
                    instance.addDocument(jsonDeserializationContext.
                            deserialize(element, InstanceDocument.class));
                }
            }
        }

        return instance;
    }
}
