package models.checks.courts;

import models.checks.Participant;

import java.time.LocalDate;

public class ComplaintAct {
    private LocalDate receiptDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String result;
    private boolean certiorari;
    private Participant declarant;

    public ComplaintAct() {
        this.certiorari = false;
    }

    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isCertiorari() {
        return certiorari;
    }

    public void setCertiorari(boolean certiorari) {
        this.certiorari = certiorari;
    }

    public Participant getDeclarant() {
        return declarant;
    }

    public void setDeclarant(Participant declarant) {
        this.declarant = declarant;
    }
}
