package models.checks;

import java.time.LocalDate;

public class PowerOfAttorneyCheck {

    private String number;
    private LocalDate date;
    private String issuerType;
    private String notaryId;
    private String issuerFio;
    private String issuerRegion;
    private String issuerCountry;
    private String attorneyState;
    private String attorneyDescription;

    public PowerOfAttorneyCheck() {
    }

    public static PowerOfAttorneyCheck returnMockPowerOfAttorneyCHeck() {
        PowerOfAttorneyCheck mock = new PowerOfAttorneyCheck();
        mock.setNumber("");
        mock.setIssuerType("");
        mock.setIssuerFio("");
        mock.setIssuerCountry("");
        mock.setIssuerRegion("");
        mock.setNotaryId("");
        mock.setAttorneyState("");
        mock.setAttorneyDescription("");
        return mock;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getIssuerType() {
        return issuerType;
    }

    public void setIssuerType(String issuerType) {
        this.issuerType = issuerType;
    }

    public String getNotaryId() {
        return notaryId;
    }

    public void setNotaryId(String notaryId) {
        this.notaryId = notaryId;
    }

    public String getIssuerFio() {
        return issuerFio;
    }

    public void setIssuerFio(String issuerFio) {
        this.issuerFio = issuerFio;
    }

    public String getIssuerRegion() {
        return issuerRegion;
    }

    public void setIssuerRegion(String issuerRegion) {
        this.issuerRegion = issuerRegion;
    }

    public String getIssuerCountry() {
        return issuerCountry;
    }

    public void setIssuerCountry(String issuerCountry) {
        this.issuerCountry = issuerCountry;
    }

    public String getAttorneyState() {
        return attorneyState;
    }

    public void setAttorneyState(String attorneyState) {
        this.attorneyState = attorneyState;
    }

    public String getAttorneyDescription() {
        return attorneyDescription;
    }

    public void setAttorneyDescription(String attorneyDescription) {
        this.attorneyDescription = attorneyDescription;
    }

    @Override
    public String toString() {
        return "PowerOfAttorneyCheck{" +
                "number='" + number + '\'' +
                ", date=" + date +
                ", issuerType='" + issuerType + '\'' +
                ", notaryId='" + notaryId + '\'' +
                ", issuerFio='" + issuerFio + '\'' +
                ", issuerRegion='" + issuerRegion + '\'' +
                ", issuerCountry='" + issuerCountry + '\'' +
                ", attorneyState='" + attorneyState + '\'' +
                ", attorneyDescription='" + attorneyDescription + '\'' +
                '}';
    }
}
