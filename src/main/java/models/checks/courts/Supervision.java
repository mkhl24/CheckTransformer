package models.checks.courts;

import java.util.ArrayList;
import java.util.List;

public class Supervision implements DiscussionStage {

    private FirstInstance firstInstance;
    private String complainedAct;
    private List<ComplaintAct> complaints;

    public Supervision() {
        this.complaints = new ArrayList<>();
    }

    public FirstInstance getFirstInstance() {
        return firstInstance;
    }

    public void setFirstInstance(FirstInstance firstInstance) {
        this.firstInstance = firstInstance;
    }

    public String getComplainedAct() {
        return complainedAct;
    }

    public void setComplainedAct(String complainedAct) {
        this.complainedAct = complainedAct;
    }

    public void addComplaint(ComplaintAct complaint) {
        if (complaint != null)
            this.complaints.add(complaint);
    }
}
