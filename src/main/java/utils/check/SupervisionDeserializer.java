package utils.check;

import com.google.gson.*;
import models.checks.courts.ComplaintAct;
import models.checks.courts.FirstInstance;
import models.checks.courts.Supervision;

import java.lang.reflect.Type;

public class SupervisionDeserializer implements JsonDeserializer<Supervision> {

    @Override
    public Supervision deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Supervision supervision = new Supervision();
        JsonObject object = jsonElement.getAsJsonObject();

        if (object.has("firstInstance")) {
            JsonObject fInstance = object.getAsJsonObject("firstInstance");
            supervision.setFirstInstance(jsonDeserializationContext.
                    deserialize(fInstance, FirstInstance.class));
        }
        if (object.has("complainedAct")) {
            supervision.setComplainedAct(object.get("complainedAct").getAsString());
        }

        if (object.has("complaints")) {
            JsonArray complaints = object.getAsJsonArray("complaints");
            for (JsonElement comp : complaints) {
                supervision.addComplaint(jsonDeserializationContext.
                        deserialize(comp.getAsJsonObject(), ComplaintAct.class));
            }
        }

        return supervision;
    }
}
