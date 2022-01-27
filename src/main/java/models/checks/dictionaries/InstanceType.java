package models.checks.dictionaries;

public enum InstanceType {

    INITIAL("Initial", "Первая инстанция"),
    APPEAL("Appeal", "Апелляционная инстанция"),
    CASSATION("Cassation", "Кассационная инстанция"),
    SUPREME("Supreme", "Верховный суд");

    private final String key;
    private final String value;

    InstanceType(String key, String value) {
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
