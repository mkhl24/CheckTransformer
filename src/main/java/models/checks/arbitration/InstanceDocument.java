package models.checks.arbitration;

import java.time.LocalDate;

public class InstanceDocument {
    private LocalDate issueDate;
    private String documentType;
    private String documentDecision;

    public InstanceDocument() {
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentDecision() {
        return documentDecision;
    }

    public void setDocumentDecision(String documentDecision) {
        this.documentDecision = documentDecision;
    }
}
