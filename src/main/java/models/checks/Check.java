package models.checks;

import models.checks.arbitration.ArbitrationCheckResult;
import models.checks.bankruptcy.BankruptcyCheck;
import models.checks.commercialactivity.CommercialActivityCheck;
import models.checks.courts.CourtCheck;
import models.checks.fssp.FsspCheck;
import models.checks.rosfinmonitoring.RosfinmonitoringCheck;

public class Check {

    private FsspCheck fsspCheck;
    private boolean hasFsspCheck;

    private boolean hasCourtCheck;
    private CourtCheck courtCheck;

    private RosfinmonitoringCheck rosfinmonitoringCheck;
    private boolean hasRosfinmonitoringCheck;

    private CommercialActivityCheck commercialActivityCheck;
    private boolean hasCommercialActivityCheck;

    private PassportCheck passportCheck;
    private boolean hasPassportCheck;

    private SnilsCheck snilsCheck;
    private boolean hasSnilsCheck;

    private PowerOfAttorneyCheck powerOfAttorneyCheck;
    private boolean hasPowerOfAttorneyCheck;

    private ArbitrationCheckResult arbitrationCheck;
    private boolean hasArbitrationCheck;

    private BankruptcyCheck bankruptcyCheck;
    private boolean hasBankruptcyCheck;


    public Check() {
        this.hasFsspCheck = false;
        this.hasCourtCheck = false;
        this.hasRosfinmonitoringCheck = false;
        this.hasCommercialActivityCheck = false;
        this.hasPassportCheck = false;
        this.hasSnilsCheck = false;
        this.hasPowerOfAttorneyCheck = false;
        this.hasArbitrationCheck = false;
        this.hasBankruptcyCheck = false;
    }

    public FsspCheck getFsspCheck() {
        return fsspCheck;
    }

    public void setFsspCheck(FsspCheck fsspCheck) {
        this.fsspCheck = fsspCheck;
    }

    public CourtCheck getCourtCheck() {
        return courtCheck;
    }

    public void setCourtCheck(CourtCheck courtCheck) {
        this.courtCheck = courtCheck;
    }

    public RosfinmonitoringCheck getRosfinmonitoringCheck() {
        return rosfinmonitoringCheck;
    }

    public void setRosfinmonitoringCheck(RosfinmonitoringCheck rosfinmonitoringCheck) {
        this.rosfinmonitoringCheck = rosfinmonitoringCheck;
    }

    public CommercialActivityCheck getCommercialActivityCheck() {
        return commercialActivityCheck;
    }

    public void setCommercialActivityCheck(CommercialActivityCheck commercialActivityCheck) {
        this.commercialActivityCheck = commercialActivityCheck;
    }

    public PassportCheck getPassportCheck() {
        return passportCheck;
    }

    public void setPassportCheck(PassportCheck passportCheck) {
        this.passportCheck = passportCheck;
    }

    public SnilsCheck getSnilsCheck() {
        return snilsCheck;
    }

    public void setSnilsCheck(SnilsCheck snilsCheck) {
        this.snilsCheck = snilsCheck;
    }

    public PowerOfAttorneyCheck getPowerOfAttorneyCheck() {
        return powerOfAttorneyCheck;
    }

    public void setPowerOfAttorneyCheck(PowerOfAttorneyCheck powerOfAttorneyCheck) {
        this.powerOfAttorneyCheck = powerOfAttorneyCheck;
    }

    public ArbitrationCheckResult getArbitrationCheck() {
        return arbitrationCheck;
    }

    public void setArbitrationCheck(ArbitrationCheckResult arbitrationCheckResult) {
        this.arbitrationCheck = arbitrationCheckResult;
    }

    public BankruptcyCheck getBankruptcyCheck() {
        return bankruptcyCheck;
    }

    public void setBankruptcyCheck(BankruptcyCheck bankruptcyCheck) {
        this.bankruptcyCheck = bankruptcyCheck;
    }

    public void toggleFsspCheck() {
        if (!this.hasFsspCheck) {
            this.hasFsspCheck = true;
        }
    }

    public void toggleCourtCheck() {
        if (!this.hasCourtCheck) {
            this.hasCourtCheck = true;
        }
    }

    public void toggleRosfinmonitoringCheck() {
        if (!this.hasRosfinmonitoringCheck) {
            this.hasRosfinmonitoringCheck = true;
        }
    }

    public void toggleCommercialActivityCheck() {
        if (!this.hasCommercialActivityCheck) {
            this.hasCommercialActivityCheck = true;
        }
    }

    public void togglePassportCheck() {
        if (!this.hasPassportCheck) {
            this.hasPassportCheck = true;
        }
    }

    public void toggleSnilsCheck() {
        if (!this.hasSnilsCheck) {
            this.hasSnilsCheck = true;
        }
    }

    public void togglePowerOfAttorneyCheck () {
        if (!this.hasPowerOfAttorneyCheck) {
            this.hasPowerOfAttorneyCheck = true;
        }
    }

    public void toggleArbitrationCheck() {
        if (!this.hasArbitrationCheck) {
            this.hasArbitrationCheck = true;
        }
    }

    public void toggleBankruptcyCheck() {
        if (!this.hasBankruptcyCheck) {
            this.hasBankruptcyCheck = true;
        }
    }

    public boolean isHasArbitrationCheck() {
        return hasArbitrationCheck;
    }

    public boolean isHasCourtCheck() {
        return hasCourtCheck;
    }

    public boolean isHasFsspCheck() {
        return hasFsspCheck;
    }

    public boolean isHasRosfinmonitoringCheck() {
        return hasRosfinmonitoringCheck;
    }

    public boolean isHasCommercialActivityCheck() {
        return hasCommercialActivityCheck;
    }

    public boolean isHasPassportCheck() {
        return hasPassportCheck;
    }

    public boolean isHasSnilsCheck() {
        return hasSnilsCheck;
    }

    public boolean isHasPowerOfAttorneyCheck() {
        return hasPowerOfAttorneyCheck;
    }

    public boolean isHasBankruptcyCheck() {
        return hasBankruptcyCheck;
    }

    @Override
    public String toString() {
        return "Check{" +
                "\nfsspCheck=" + fsspCheck +
                "\ncourtCheck=" + courtCheck +
                "\npassportCheck " + passportCheck +
                "\nsnilsCheck " + snilsCheck +
                "\npowerOfAttorneyCheck " + powerOfAttorneyCheck +
                '}';
    }
}
