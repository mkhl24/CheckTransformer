package models.checks.courts;

public class Appeal implements DiscussionStage {
    private FirstInstance firstInstance;

    public Appeal() {
    }

    public FirstInstance getFirstInstance() {
        return firstInstance;
    }

    public void setFirstInstance(FirstInstance firstInstance) {
        this.firstInstance = firstInstance;
    }
}
