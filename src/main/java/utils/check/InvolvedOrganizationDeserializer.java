package utils.check;

import com.google.gson.*;
import models.checks.arbitration.ArbitrationCheckResult;
import models.checks.commercialactivity.InvolvedOrganization;
import models.checks.commercialactivity.OrganizationActivity;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class InvolvedOrganizationDeserializer implements JsonDeserializer<InvolvedOrganization> {
    @Override
    public InvolvedOrganization deserialize(JsonElement jsonElement, Type type,
                                            JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        InvolvedOrganization organization = new InvolvedOrganization();
        JsonObject object = jsonElement.getAsJsonObject();

        organization.setName(object.get("name").getAsString());
        if (object.has("inn")) {
            organization.setInn(object.get("inn").getAsString());
        } else {
            organization.setInn("");
        }
        organization.setOgrn(object.get("ogrn").getAsString());
        if (object.has("kpp")) {
            organization.setKpp(object.get("kpp").getAsString());
        } else {
            organization.setKpp("");
        }

        JsonArray relationshipTypeArray = object.getAsJsonArray("relationshipType");
        for (JsonElement element : relationshipTypeArray) {
            organization.addRelationshipType(element.getAsString());
        }

        if (object.has("status")) {
            organization.setStatus(object.get("status").getAsString());
        } else {
            organization.setStatus("");
        }
        if (object.has("statusDate")) {
            organization.setStatusDate(jsonDeserializationContext.
                    deserialize(object.get("statusDate"), LocalDate.class));
        }
        if (object.has("registrationDate")) {
            organization.setRegistrationDate(jsonDeserializationContext.
                    deserialize(object.get("registrationDate"), LocalDate.class));
        }

        organization.setOrganizationActivity(jsonDeserializationContext.
                deserialize(object.get("activity"), OrganizationActivity.class));


        if (object.has("arbitration")) {
            organization.setArbitrationCheckResult(jsonDeserializationContext.
                    deserialize(object.get("arbitration"), ArbitrationCheckResult.class));
        }

        // analytics
        if (object.has("analytics")) {
            JsonObject analyticsObject = object.getAsJsonObject("analytics");
            JsonArray generalIndicatorsArray =
                    analyticsObject.getAsJsonArray("generalIndicators");
            if (generalIndicatorsArray.size() != 0) {
                for (JsonElement element : generalIndicatorsArray) {
                    organization.addGeneralIndicators(element.getAsString());
                }
            }
            JsonArray bankruptcyIndicatorsArray =
                    analyticsObject.getAsJsonArray("bankruptcyIndicators");
            if (bankruptcyIndicatorsArray.size() != 0) {
                for (JsonElement element : generalIndicatorsArray) {
                    organization.addBankruptcyIndicators(element.getAsString());
                }
            }
            JsonArray affiliationArray =
                    analyticsObject.getAsJsonArray("affiliation");
            if (affiliationArray.size() != 0) {
                for (JsonElement element : generalIndicatorsArray) {
                    organization.addAffiliation(element.getAsString());
                }
            }
        }

        return organization;
    }
}
