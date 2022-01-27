package models.checks.arbitration;

public class ArbitrationCheck {

    private String subjectId;
    private ArbitrationCheckResult acResult;

    public ArbitrationCheck() {
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public ArbitrationCheckResult getAcResult() {
        return acResult;
    }

    public void setAcResult(ArbitrationCheckResult acResult) {
        this.acResult = acResult;
    }
}
