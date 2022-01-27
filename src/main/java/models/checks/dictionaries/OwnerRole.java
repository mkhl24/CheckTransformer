package models.checks.dictionaries;

public enum OwnerRole {
    DIRECTOR("Director", "Руководитель"),
    FOUNDER("Founder", "Учредитель"),
    SHAREHOLDER("Shareholder", "Акционер");


    private final String key;
    private final String value;

    OwnerRole(String key, String value) {
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
