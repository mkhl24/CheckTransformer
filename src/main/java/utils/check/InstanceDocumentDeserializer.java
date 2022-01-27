package utils.check;

import com.google.gson.*;
import models.checks.arbitration.InstanceDocument;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class InstanceDocumentDeserializer implements JsonDeserializer<InstanceDocument> {
    @Override
    public InstanceDocument deserialize(JsonElement jsonElement, Type type,
                                        JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        InstanceDocument document = new InstanceDocument();
        JsonObject object = jsonElement.getAsJsonObject();
        if (object.has("issueDate")) {
            document.setIssueDate(jsonDeserializationContext.
                    deserialize(object.get("issueDate"), LocalDate.class));
        }
        if (object.has("documentType")) {
            document.setDocumentType(object.get("documentType").getAsString());
        } else {
            document.setDocumentType("");
        }
        if (object.has("documentDecision")) {
            document.setDocumentDecision(object.get("documentDecision").getAsString());
        } else {
            document.setDocumentDecision("");
        }
        return document;
    }
}
