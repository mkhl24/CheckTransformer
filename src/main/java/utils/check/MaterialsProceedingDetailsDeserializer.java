package utils.check;

import com.google.gson.*;
import models.checks.courts.MaterialsProceedingDetails;

import java.lang.reflect.Type;

public class MaterialsProceedingDetailsDeserializer implements JsonDeserializer<MaterialsProceedingDetails> {
    @Override
    public MaterialsProceedingDetails deserialize(JsonElement jsonElement,
                                                  Type type, JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        JsonObject object = jsonElement.getAsJsonObject();
        MaterialsProceedingDetails mpd = new MaterialsProceedingDetails();

        if (object.has("materialType")) {
            mpd.setMaterialType(object.get("materialType").getAsString());
        } else {
            mpd.setMaterialType("");
        }
        if (object.has("proceedingCategory")) {
            mpd.setProceedingCategory(object.get("proceedingCategory").getAsString());
        } else {
            mpd.setProceedingCategory("");
        }
        if (object.has("executionStartDate")) {
            mpd.setExecutionStartDate(object.get("executionStartDate").getAsString());
        } else {
            mpd.setExecutionStartDate("");
        }

        return mpd;
    }
}
