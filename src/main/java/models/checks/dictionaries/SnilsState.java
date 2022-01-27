package models.checks.dictionaries;

public enum SnilsState {

    VALID("Valid", "СНИЛС подтвержден"),
    INVALID("InValid", "СНИЛС не соответствует данным"),
    NOT_FOUND("NotFound", "По указанному СНИЛС нет данных в ПФР"),
    INCORRECT_SNILS_SUM("IncorrectSnilsSum", "Неверная контрольная сумма СНИЛС");

    private final String key;
    private final String value;

    SnilsState(String key, String value) {
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
