package models.checks.courts;

public class MaterialsProceedingDetails implements ProceedingDetails {

    private String materialType;
    private String proceedingCategory;
    private String ExecutionStartDate;

    public MaterialsProceedingDetails() {
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getProceedingCategory() {
        return proceedingCategory;
    }

    public void setProceedingCategory(String proceedingCategory) {
        this.proceedingCategory = proceedingCategory;
    }

    public String getExecutionStartDate() {
        return ExecutionStartDate;
    }

    public void setExecutionStartDate(String executionStartDate) {
        ExecutionStartDate = executionStartDate;
    }
}
