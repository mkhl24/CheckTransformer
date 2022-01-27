package models.checks.rosfinmonitoring;

import java.time.LocalDate;

public class PersonTerroristResult {
    private String fio;
    private LocalDate birthDate;
    private String birthPlace;
    private String terroristState;
    private String foundBy;

    public PersonTerroristResult() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getTerroristState() {
        return terroristState;
    }

    public void setTerroristState(String terroristState) {
        this.terroristState = terroristState;
    }

    public String getFoundBy() {
        return foundBy;
    }

    public void setFoundBy(String foundBy) {
        this.foundBy = foundBy;
    }
}
