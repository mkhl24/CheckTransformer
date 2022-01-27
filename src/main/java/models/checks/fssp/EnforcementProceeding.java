package models.checks.fssp;

import java.time.LocalDate;

public class EnforcementProceeding {

    private String number;
    private LocalDate startDate;
    private LocalDate endDate;
    private String endReason;
    private String subjectDescription;
    private String region;
    private String enforcement;
    private String sum;
    private String document;
    private String department;

    public EnforcementProceeding() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getEndReason() {
        return endReason;
    }

    public void setEndReason(String endReason) {
        this.endReason = endReason;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEnforcement() {
        return enforcement;
    }

    public void setEnforcement(String enforcement) {
        this.enforcement = enforcement;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EnforcementProceeding{" +
                "number='" + number + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", endReason='" + endReason + '\'' +
                ", subjectDescription='" + subjectDescription + '\'' +
                ", region='" + region + '\'' +
                ", enforcement='" + enforcement + '\'' +
                ", sum='" + sum + '\'' +
                ", document='" + document + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
