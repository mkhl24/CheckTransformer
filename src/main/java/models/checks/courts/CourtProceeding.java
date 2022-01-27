package models.checks.courts;

import models.checks.Participant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourtProceeding {
    private String number;
    private LocalDate proceedingStartDate;
    private String courtName;
    private String judge;
    private String region;
    private String proceedingType;
    private String proceedingResult;
    private String proceedingURL;
    private ProceedingDetails proceedingDetails;
    private DiscussionStage discussionStage;
    private List<Participant> participants;


    public CourtProceeding() {
        this.participants = new ArrayList<>();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getProceedingStartDate() {
        return proceedingStartDate;
    }

    public void setProceedingStartDate(LocalDate proceedingStartDate) {
        this.proceedingStartDate = proceedingStartDate;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProceedingType() {
        return proceedingType;
    }

    public void setProceedingType(String proceedingType) {
        this.proceedingType = proceedingType;
    }

    public String getProceedingResult() {
        return proceedingResult;
    }

    public void setProceedingResult(String proceedingResult) {
        this.proceedingResult = proceedingResult;
    }

    public String getProceedingURL() {
        return proceedingURL;
    }

    public void setProceedingURL(String proceedingURL) {
        this.proceedingURL = proceedingURL;
    }

    public ProceedingDetails getProceedingDetails() {
        return proceedingDetails;
    }

    public void setProceedingDetails(ProceedingDetails proceedingDetails) {
        this.proceedingDetails = proceedingDetails;
    }
    public void addParticipant(Participant participant) {
        if (participant != null) {
            participants.add(participant);
        }
    }

    public DiscussionStage getDiscussionStage() {
        return discussionStage;
    }

    public void setDiscussionStage(DiscussionStage discussionStage) {
        this.discussionStage = discussionStage;
    }
}
