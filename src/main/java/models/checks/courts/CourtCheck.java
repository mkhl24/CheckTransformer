package models.checks.courts;

import java.util.ArrayList;
import java.util.List;

public class CourtCheck {

    private String subjectId;
    private List<String> regions;
    private List<CourtProceeding> courtProceedings;

    public CourtCheck() {
        this.regions = new ArrayList<>();
        this.courtProceedings = new ArrayList<>();
    }

    public void addRegion (String region) {
        this.regions.add(region);
    }

    public void addCourtProceeding(CourtProceeding courtProceeding) {
        this.courtProceedings.add(courtProceeding);
    }

    public static CourtCheck returnMockCourtCheck() {
        CourtCheck mockCheck = new CourtCheck();
        mockCheck.setSubjectId("n/a");
        return mockCheck;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public List<String> getRegions() {
        return regions;
    }


    @Override
    public String toString() {
        return "CourtCheck{" +
                "subjectId='" + subjectId + '\'' +
                ", regions=" + regions +
                ", courtProceedings=" + courtProceedings +
                '}';
    }
}
