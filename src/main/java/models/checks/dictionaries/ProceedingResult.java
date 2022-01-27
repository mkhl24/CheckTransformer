package models.checks.dictionaries;

public enum ProceedingResult {

    LOST("Lost", "Проигранные дела"),
    PARTIALLY_LOST("PartiallyLost", "Частично проигранные"),
    NOT_LOST("NotLost", "Не проигранные"),
    IN_PROGRESS("InProgress", "В процессе рассмотрения"),
    BLIND_SPOT("BlindSpot", "Не удалось распознать исход дела");

    private final String key;
    private final String value;

    ProceedingResult(String key, String value) {
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
