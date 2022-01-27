package models.checks.arbitration;

import models.checks.Analytics;

import java.util.ArrayList;
import java.util.List;

public class ArbitrationCheckResult {

    private int count;
    private double sum;
    private List<Analytics> groupByResult;
    private List<Analytics> groupByCategory;
    private List<ArbitrationProceeding> proceedings;

    public ArbitrationCheckResult() {
        this.groupByCategory = new ArrayList<>();
        this.groupByResult = new ArrayList<>();
        this.proceedings = new ArrayList<>();
    }

    public static ArbitrationCheckResult returnMockArbitrationCheck() {
        ArbitrationCheckResult arbitrationCheck = new ArbitrationCheckResult();
        arbitrationCheck.setSum(0);
        arbitrationCheck.setCount(0);
        return arbitrationCheck;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public List<Analytics> getGroupByResult() {
        return groupByResult;
    }

    public List<Analytics> getGroupByCategory() {
        return groupByCategory;
    }

    public List<ArbitrationProceeding> getProceedings() {
        return proceedings;
    }

    public void addGroupByResultElement(Analytics analytics) {
        this.groupByResult.add(analytics);
    }

    public void addGroupByCategoryElement(Analytics analytics) {
        this.groupByCategory.add(analytics);
    }

    public void addProceeding(ArbitrationProceeding proceeding) {
        proceedings.add(proceeding);
    }
}

