package models.checks.dictionaries;

public enum OwnerType {

    FI("FI", "Физическое лицо"),
    UI("UI", "Российское юридичесекое лицо"),
    FOREIGN_UI("ForeignUl", "Иностранное юридическое лицо");


    private final String key;
    private final String value;

    OwnerType(String key, String value) {
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
