package models.checks;

public class PassportCheck {

    private String subjectId;
    private String passportState;

    public PassportCheck() {
    }

    public static PassportCheck returnMockPassportCheck() {
        PassportCheck passportCheck = new PassportCheck();
        passportCheck.setPassportState("");
        passportCheck.setSubjectId("");
        return passportCheck;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getPassportState() {
        return passportState;
    }

    public void setPassportState(String passportState) {
        this.passportState = passportState;
    }

    @Override
    public String toString() {
        return "PassportCheck{" +
                "subjectId='" + subjectId + '\'' +
                ", passportState='" + passportState + '\'' +
                '}';
    }
}
