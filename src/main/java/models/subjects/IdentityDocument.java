package models.subjects;

import java.time.LocalDate;

public class IdentityDocument {
    private String number;
    private String series;
    private LocalDate issueDate;
    private String issuer;

    public IdentityDocument() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public static IdentityDocument setMockID() {
        IdentityDocument mockId = new IdentityDocument();
        mockId.setIssuer("-");
        mockId.setNumber("-");
        mockId.setSeries("-");
        mockId.setIssueDate(LocalDate.now());
        return mockId;
    }

    @Override
    public String toString() {
        return "IdentityDocument{" +
                "number='" + number + '\'' +
                ", series='" + series + '\'' +
                ", issueDate=" + issueDate +
                ", issuer='" + issuer + '\'' +
                '}';
    }
}
