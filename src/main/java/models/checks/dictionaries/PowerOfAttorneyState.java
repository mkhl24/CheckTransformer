package models.checks.dictionaries;

public enum PowerOfAttorneyState {

    ACTIVE("Active", "Доверенность найдена и она действительна"),
    NOT_FOUND("NotFound", "Доверенность не найдена"),
    RECALLED("Recalled", "Доверенность отозвана");

    private final String key;
    private final String value;

    PowerOfAttorneyState(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
