package models.checks;

public class SnilsCheck {

    private String subjectId;
    private String resultState;

    public SnilsCheck() {
    }

    public static SnilsCheck returnMockSnilsCheck() {
        SnilsCheck mock = new SnilsCheck();
        mock.setResultState("");
        mock.setSubjectId("");
        return mock;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getResultState() {
        return resultState;
    }

    public void setResultState(String resultState) {
        this.resultState = resultState;
    }

    @Override
    public String toString() {
        return "SnilsCheck{" +
                "subjectId='" + subjectId + '\'' +
                ", resultState='" + resultState + '\'' +
                '}';
    }
}
