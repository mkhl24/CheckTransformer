package models.checks.rosfinmonitoring;

import java.util.ArrayList;
import java.util.List;

public class PersonRFMCheck {

    private boolean distributorWMD;
    private List<PersonTerroristResult> terroristResults;

    public PersonRFMCheck() {
        this.distributorWMD = false;
        this.terroristResults = new ArrayList<>();
    }

    public boolean isDistributorWMD() {
        return distributorWMD;
    }

    public void setDistributorWMD(boolean distributorWMD) {
        this.distributorWMD = distributorWMD;
    }

    public List<PersonTerroristResult> getTerroristResults() {
        return terroristResults;
    }

    public void addPersonTerroristResult(PersonTerroristResult result) {
        if (result != null) {
            terroristResults.add(result);
        }
    }
}
