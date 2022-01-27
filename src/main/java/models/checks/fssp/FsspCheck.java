package models.checks.fssp;

import models.checks.Analytics;

import java.util.ArrayList;
import java.util.List;

public class FsspCheck {

    private String subjectId;
    private List<String> regions;
    private List<EnforcementProceeding> enforcementProceedingList;
    private List<Analytics> groupByEnforcement;

    public FsspCheck() {
        this.regions = new ArrayList<>();
        this.enforcementProceedingList = new ArrayList<>();
        this.groupByEnforcement = new ArrayList<>();
    }

    public void addRegion(String region) {
        regions.add(region);
    }

    public void addEnforcementProceeding(EnforcementProceeding enforcementProceeding) {
        enforcementProceedingList.add(enforcementProceeding);
    }

    public void addByEnforcementAnalytics(Analytics analytics) {
        groupByEnforcement.add(analytics);
    }

    public static FsspCheck returnMockFsspCheck() {
        FsspCheck mockCheck = new FsspCheck();
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
        return "FsspCheck{" +
                "subjectId='" + subjectId + '\'' +
                ", regions=" + regions +
                ", enforcementProceedingList=" + enforcementProceedingList +
                '}';
    }
}
