package models.checks.courts;

public class Complaint  implements DiscussionStage {

    private FirstInstance firstInstance;

    public Complaint() {
    }

    public FirstInstance getFirstInstance() {
        return firstInstance;
    }

    public void setFirstInstance(FirstInstance firstInstance) {
        this.firstInstance = firstInstance;
    }
}
