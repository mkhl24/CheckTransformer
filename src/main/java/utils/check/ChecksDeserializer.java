package utils.check;

import com.google.gson.*;
import models.checks.Check;
import models.checks.PassportCheck;
import models.checks.PowerOfAttorneyCheck;
import models.checks.SnilsCheck;
import models.checks.arbitration.ArbitrationCheckResult;
import models.checks.bankruptcy.BankruptcyCheck;
import models.checks.commercialactivity.CommercialActivityCheck;
import models.checks.courts.CourtCheck;
import models.checks.fssp.FsspCheck;
import models.checks.rosfinmonitoring.RosfinmonitoringCheck;

import java.lang.reflect.Type;

public class ChecksDeserializer implements JsonDeserializer<Check> {
    @Override
    public Check deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

        Check check = new Check();
        JsonObject jsonObject = jsonElement.getAsJsonObject();

        JsonArray items = jsonObject.getAsJsonArray("items");
        for (JsonElement item : items) {
            JsonObject checkItem = item.getAsJsonObject();

            if (checkItem.has("fssp")) {
                check.toggleFsspCheck();
                check.setFsspCheck(jsonDeserializationContext
                        .deserialize(checkItem, FsspCheck.class));
            }

            if (checkItem.has("courts")) {
                check.toggleCourtCheck();
                check.setCourtCheck(jsonDeserializationContext
                        .deserialize(checkItem, CourtCheck.class));
            }

            if (checkItem.has("rosfinmonitoring")) {
                check.toggleRosfinmonitoringCheck();
                check.setRosfinmonitoringCheck(jsonDeserializationContext.
                        deserialize(checkItem, RosfinmonitoringCheck.class));
            }

            if (checkItem.has("commercialActivity")) {
                check.toggleCommercialActivityCheck();
                check.setCommercialActivityCheck(jsonDeserializationContext.
                        deserialize(checkItem, CommercialActivityCheck.class));
            }

            if (checkItem.has("passport")) {
                check.togglePassportCheck();
                check.setPassportCheck(jsonDeserializationContext.
                        deserialize(checkItem, PassportCheck.class));
            }

            if (checkItem.has("snils")) {
                check.toggleSnilsCheck();
                check.setSnilsCheck(jsonDeserializationContext.
                        deserialize(checkItem, SnilsCheck.class));
            }
            if (checkItem.has("powerOfAttorney")) {
                check.togglePowerOfAttorneyCheck();
                check.setPowerOfAttorneyCheck(jsonDeserializationContext.
                        deserialize(checkItem, PowerOfAttorneyCheck.class));
            }
            if (checkItem.has("arbitration")) {
                check.toggleArbitrationCheck();
                check.setArbitrationCheck(jsonDeserializationContext.
                        deserialize(checkItem, ArbitrationCheckResult.class));
            }
            if (checkItem.has("bankruptcy")) {
                check.toggleBankruptcyCheck();
                check.setBankruptcyCheck(jsonDeserializationContext.
                        deserialize(checkItem, BankruptcyCheck.class));
            }


            if (!check.isHasFsspCheck()) {
                check.setFsspCheck(FsspCheck.
                        returnMockFsspCheck());
            }
            if (!check.isHasCourtCheck()) {
                check.setCourtCheck(CourtCheck.
                        returnMockCourtCheck());
            }
            if (!check.isHasRosfinmonitoringCheck()) {
                check.setRosfinmonitoringCheck(RosfinmonitoringCheck.
                        returnMockRosfinmonitoringCheck());
            }
            if (!check.isHasCommercialActivityCheck()) {
                check.setCommercialActivityCheck(CommercialActivityCheck.
                        returnMockCommercialActivityCheck());
            }
            if (!check.isHasPassportCheck()) {
                check.setPassportCheck(PassportCheck.
                        returnMockPassportCheck());
            }
            if (!check.isHasSnilsCheck()) {
                check.setSnilsCheck(SnilsCheck.
                        returnMockSnilsCheck());
            }
            if (!check.isHasPowerOfAttorneyCheck()) {
                check.setPowerOfAttorneyCheck(PowerOfAttorneyCheck.
                        returnMockPowerOfAttorneyCHeck());
            }
            if (!check.isHasArbitrationCheck()) {
                check.setArbitrationCheck(ArbitrationCheckResult.
                        returnMockArbitrationCheck());
            }
            if (!check.isHasBankruptcyCheck()) {
                check.setBankruptcyCheck(BankruptcyCheck.
                        returnMockBankruptcyCheck());
            }

        }

        return check;
    }
}
