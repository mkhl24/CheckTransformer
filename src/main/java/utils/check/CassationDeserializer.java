package utils.check;

import com.google.gson.*;
import models.checks.courts.Cassation;
import models.checks.courts.ComplaintAct;
import models.checks.courts.FirstInstance;

import java.lang.reflect.Type;

public class CassationDeserializer implements JsonDeserializer<Cassation> {
    @Override
    public Cassation deserialize(JsonElement jsonElement, Type type,
                                 JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        Cassation cassation = new Cassation();
        JsonObject object = jsonElement.getAsJsonObject();

        if (object.has("firstInstance")) {
            cassation.setFirstInstance(jsonDeserializationContext.
                    deserialize(object.get("firstInstance"), FirstInstance.class));
        }
        if (object.has("complainedAct")) {
            cassation.setComplainedAct(object.get("complainedAct").getAsString());
        }

        if (object.has("complaints")) {
            JsonArray complaints = object.getAsJsonArray("complaints");
            for (JsonElement comp : complaints) {
                cassation.addComplaint(jsonDeserializationContext.
                        deserialize(comp.getAsJsonObject(), ComplaintAct.class));
            }
        }

        return null;
    }
}
