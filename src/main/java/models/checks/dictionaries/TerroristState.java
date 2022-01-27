package models.checks.dictionaries;

public enum TerroristState {

    ACTIVE("Active","Существующий"),
    EXCLUDED("Excluded", "Исключенный"),
    INCLUDED("Included", "Включенный"),
    NOT_FOUND("NotFound","Не найден");

    private final String key;
    private final String value;

    TerroristState(String key, String value) {
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
