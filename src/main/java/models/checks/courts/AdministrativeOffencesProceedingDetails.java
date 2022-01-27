package models.checks.courts;

public class AdministrativeOffencesProceedingDetails implements ProceedingDetails {

    private String protocolNumber;

    public AdministrativeOffencesProceedingDetails() {
    }

    public String getProtocolNumber() {
        return protocolNumber;
    }

    public void setProtocolNumber(String protocolNumber) {
        this.protocolNumber = protocolNumber;
    }
}
