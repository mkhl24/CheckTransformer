package models.checks.bankruptcy;

import java.util.ArrayList;
import java.util.List;

public class BankruptcyCheck {
    private String subjectId;
    private List<BankruptcyProceeding> proceedings;
    private List<String> indications;

    public BankruptcyCheck() {
        this.proceedings = new ArrayList<>();
        this.indications = new ArrayList<>();
    }

    public static BankruptcyCheck returnMockBankruptcyCheck() {
        BankruptcyCheck mockCheck = new BankruptcyCheck();
        mockCheck.setSubjectId("");
        return mockCheck;
    }

    public List<BankruptcyProceeding> getProceedings() {
        return proceedings;
    }

    public List<String> getIndications() {
        return indications;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public void addProceedings(BankruptcyProceeding proceeding) {
        this.proceedings.add(proceeding);
    }

    public void addIndications(String indication) {
        this.indications.add(indication);
    }
}