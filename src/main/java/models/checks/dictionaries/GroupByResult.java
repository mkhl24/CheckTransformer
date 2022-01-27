package models.checks.dictionaries;

public enum GroupByResult {

    LOST("Lost", ""),
    PARTIALLY_LOST("PartiallyLost", "Частично проигранные"),
    NOT_LOST("NotLost","Не проигранные"),
    IN_PROGRESS("InProgress", "В процессе рассмотрения"),
    BLIND_SPOT("BlindSpot", "Не удалось определить результат судопроизводства"),
    FINISHED("Finisher", "Судопроизводство завершено");

    private final String key;
    private final String value;

    GroupByResult(String key, String value) {
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
