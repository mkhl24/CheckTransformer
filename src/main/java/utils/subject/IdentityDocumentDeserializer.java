package utils.subject;

import com.google.gson.*;
import models.subjects.IdentityDocument;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class IdentityDocumentDeserializer implements JsonDeserializer<IdentityDocument> {

    @Override
    public IdentityDocument deserialize(JsonElement jsonElement, Type type,
                                        JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        IdentityDocument identityDocument = new IdentityDocument();

        identityDocument.setNumber(jsonObject.get("number").getAsString());
        identityDocument.setSeries(jsonObject.get("series").getAsString());
        identityDocument.setIssueDate(jsonDeserializationContext.
                deserialize(jsonObject.get("issueDate"), LocalDate.class));

        JsonObject issuerObject = jsonObject.getAsJsonObject("issuer");
        identityDocument.setIssuer(issuerObject.get("issuerCode").getAsString());
        return identityDocument;
    }
}
