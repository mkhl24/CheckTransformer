package models.checks.dictionaries;

public enum Status {

    ACTIVE("Active",
            "Действующая организация"),
    REORGANIZING("Reorganizing",
            "Организация находится в процессе реорганизации"),
    BANKRUPTING("Bankrupting",
            "Организация находится в процессе банкротства или признана банкротом"),
    DISSOLVING("Dissolving",
            "Организация находится в стадии ликвидации"),
    DISSOLVED("Dissolved",
            "Недействующая организация");

    private final String key;
    private final String value;

    Status(String key, String value) {
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
