package models.checks.dictionaries;

public enum IssuerType {

    NOTARY("Notary", "Нотариус"),
    CONSULATE("Consulate", "Работник консульского учреждения"),
    LOCAL_GOVERNMENT("LocalGovernment", "Должностное лицо местного самоуправления");

    private final String key;
    private final String value;

    IssuerType(String key, String value) {
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
