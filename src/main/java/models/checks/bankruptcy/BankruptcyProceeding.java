package models.checks.bankruptcy;

import java.time.LocalDate;

public class BankruptcyProceeding {
    private String number;
    private LocalDate date;
    private String state;
    private LocalDate lastMessageState;
    private BankruptDetails bankruptDetails;


    public BankruptcyProceeding() {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDate getLastMessageState() {
        return lastMessageState;
    }

    public void setLastMessageState(LocalDate lastMessageState) {
        this.lastMessageState = lastMessageState;
    }

    public BankruptDetails getBankruptDetails() {
        return bankruptDetails;
    }

    public void setBankruptDetails(BankruptDetails bankruptDetails) {
        this.bankruptDetails = bankruptDetails;
    }
}
