package models.checks.dictionaries;

public enum Indications {

    ARBITRATION_FOUND("ArbitrationFound",
            "Обнаружены арбитражные дела о банкротстве за последние 3 месяца"),
    MESSAGES_FOUND("MessagesFound",
            "Обнаружены сообщения о банкротстве за последние 12 месяцев"),
    DECLARATION_FOUND("DeclarationFound",
            "Обнаружены сообщения о намерении обратиться в суд с заявлением о банкротстве за последние 3 месяца"),
    FINISHED_BANKRUPTCY_FOUND("FinishedBankruptcyFound",
            "Обнаружены признаки завершенной процедуры банкротства");

    private final String key;
    private final String value;

    Indications(String key, String value) {
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
