package models.checks.commercialactivity;

import models.checks.arbitration.ArbitrationCheckResult;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InvolvedOrganization {

    private String name;
    private String inn;
    private String ogrn;
    private String kpp;
    private List<String> relationshipTypes;
    private OrganizationActivity organizationActivity;
    private String status;
    private LocalDate statusDate;
    private LocalDate registrationDate;
    private ArbitrationCheckResult arbitrationCheckResult;
    private List<String> generalIndicators;
    private List<String> bankruptcyIndicators;
    private List<String> affiliation;


    public InvolvedOrganization() {
        this.relationshipTypes = new ArrayList<>();
        this.generalIndicators = new ArrayList<>();
        this.bankruptcyIndicators = new ArrayList<>();
        this.affiliation = new ArrayList<>();
    }

    public ArbitrationCheckResult getArbitrationCheckResult() {
        return arbitrationCheckResult;
    }

    public void setArbitrationCheckResult(ArbitrationCheckResult arbitrationCheck) {
        this.arbitrationCheckResult = arbitrationCheck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public List<String> getRelationshipType() {
        return relationshipTypes;
    }

    public List<String> getRelationshipTypes() {
        return relationshipTypes;
    }

    public List<String> getGeneralIndicators() {
        return generalIndicators;
    }

    public List<String> getBankruptcyIndicators() {
        return bankruptcyIndicators;
    }

    public List<String> getAffiliation() {
        return affiliation;
    }

    public void addRelationshipType(String type) {
        if (type != null) {
            this.relationshipTypes.add(type);
        }
    }

    public void addGeneralIndicators(String ind) {
        if (ind != null) {
            this.generalIndicators.add(ind);
        }
    }

    public void addBankruptcyIndicators(String ind) {
        if (ind != null) {
            this.bankruptcyIndicators.add(ind);
        }
    }
    public void addAffiliation(String ind) {
        if (ind != null) {
            this.affiliation.add(ind);
        }
    }

    public OrganizationActivity getOrganizationActivity() {
        return organizationActivity;
    }

    public void setOrganizationActivity(OrganizationActivity organizationActivity) {
        this.organizationActivity = organizationActivity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(LocalDate statusDate) {
        this.statusDate = statusDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }


}
