package models.checks.rosfinmonitoring;

/*implements person check only */
public class RosfinmonitoringCheck {
    private String subjectId;
    private PersonRFMCheck personCheck;

    public RosfinmonitoringCheck() {
    }

    public static RosfinmonitoringCheck returnMockRosfinmonitoringCheck () {
        RosfinmonitoringCheck rfmCheck = new RosfinmonitoringCheck();
        rfmCheck.setSubjectId("n/a");
        return rfmCheck;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public PersonRFMCheck getPersonCheck() {
        return personCheck;
    }

    public void setPersonCheck(PersonRFMCheck personCheck) {
        this.personCheck = personCheck;
    }
}
