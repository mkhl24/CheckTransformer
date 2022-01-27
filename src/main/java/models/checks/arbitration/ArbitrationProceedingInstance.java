package models.checks.arbitration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArbitrationProceedingInstance {
    private LocalDate receivedInstanceDate;
    private String instanceType;
    private List<InstanceDocument> documents;

    public ArbitrationProceedingInstance() {
        this.documents = new ArrayList<>();
    }

    public LocalDate getReceivedInstanceDate() {
        return receivedInstanceDate;
    }

    public void setReceivedInstanceDate(LocalDate receivedInstanceDate) {
        this.receivedInstanceDate = receivedInstanceDate;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public List<InstanceDocument> getDocuments() {
        return documents;
    }

    public void addDocument(InstanceDocument document) {
        this.documents.add(document);
    }
}
