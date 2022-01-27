package models.checks.arbitration;

import models.checks.Participant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArbitrationProceeding {

    private String number;
    private String proceedingType;
    private String proceedingCategory;
    private LocalDate proceedingStartDate;
    private String sum;
    private List<Participant> participants;
    private List<ArbitrationProceedingInstance> instances;
    private String proceedingResult;

    public ArbitrationProceeding() {
        this.instances = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProceedingType() {
        return proceedingType;
    }

    public void setProceedingType(String proceedingType) {
        this.proceedingType = proceedingType;
    }

    public String getProceedingCategory() {
        return proceedingCategory;
    }

    public void setProceedingCategory(String proceedingCategory) {
        this.proceedingCategory = proceedingCategory;
    }

    public LocalDate getProceedingStartDate() {
        return proceedingStartDate;
    }

    public void setProceedingStartDate(LocalDate proceedingStartDate) {
        this.proceedingStartDate = proceedingStartDate;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getProceedingResult() {
        return proceedingResult;
    }

    public void setProceedingResult(String proceedingResult) {
        this.proceedingResult = proceedingResult;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public List<ArbitrationProceedingInstance> getInstances() {
        return instances;
    }

    public void addParticipants(Participant participant) {
        this.participants.add(participant);
    }

    public void addArbitrationProceedingInstance(ArbitrationProceedingInstance instance) {
        this.instances.add(instance);
    }
}
