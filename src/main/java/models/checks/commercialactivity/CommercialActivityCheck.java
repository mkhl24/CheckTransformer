package models.checks.commercialactivity;

import java.util.ArrayList;
import java.util.List;

public class CommercialActivityCheck {

    private String subjectId;
    private List<InvolvedOrganization> organizations;

    public CommercialActivityCheck() {
        this.organizations = new ArrayList<>();
    }

    public static CommercialActivityCheck returnMockCommercialActivityCheck() {
        CommercialActivityCheck check = new CommercialActivityCheck();
        check.setSubjectId("n/a");
        return check;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public List<InvolvedOrganization> getOrganizations() {
        return organizations;
    }

    public void addOrganization(InvolvedOrganization organization) {
        if (organization != null) {
            organizations.add(organization);
        }
    }
}
