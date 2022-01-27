package models.checks.courts;

public class FirstInstance implements DiscussionStage {

    private String number;
    private String courtName;

    public FirstInstance() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }
}
