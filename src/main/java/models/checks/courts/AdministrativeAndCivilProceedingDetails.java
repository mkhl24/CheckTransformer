package models.checks.courts;

public class AdministrativeAndCivilProceedingDetails implements ProceedingDetails {
    private String proceedingCategory;

    public AdministrativeAndCivilProceedingDetails() {
    }

    public String getProceedingCategory() {
        return proceedingCategory;
    }

    public void setProceedingCategory(String proceedingCategory) {
        this.proceedingCategory = proceedingCategory;
    }
}
