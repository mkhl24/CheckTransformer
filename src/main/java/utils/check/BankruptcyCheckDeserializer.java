package utils.check;

import com.google.gson.*;
import models.checks.bankruptcy.BankruptcyCheck;
import models.checks.bankruptcy.BankruptcyProceeding;

import java.lang.reflect.Type;

public class BankruptcyCheckDeserializer implements JsonDeserializer<BankruptcyCheck> {
    @Override
    public BankruptcyCheck deserialize(JsonElement jsonElement, Type type,
                                       JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        BankruptcyCheck bankruptcyCheck = new BankruptcyCheck();
        JsonObject object = jsonElement.getAsJsonObject();
        object = object.getAsJsonObject("bankruptcy");
        bankruptcyCheck.setSubjectId(object.get("subjectId").getAsString());

        if (object.has("result")) {
            object = object.getAsJsonObject("result");
            JsonArray proceedingsArray = object.getAsJsonArray("proceedings");
            if (proceedingsArray.size() != 0) {
                for (JsonElement element : proceedingsArray) {
                    bankruptcyCheck.addProceedings(jsonDeserializationContext.
                            deserialize(element, BankruptcyProceeding.class));
                }
            }
            if (object.has("indications")) {
                JsonArray indicationsArray = object.getAsJsonArray("indications");
                if (indicationsArray.size() != 0) {
                    for (JsonElement element : indicationsArray) {
                        bankruptcyCheck.addIndications(element.getAsString());
                    }
                }
            }
        }

        return bankruptcyCheck;
    }
}
