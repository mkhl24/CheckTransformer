package models.checks.dictionaries;

public enum PassportState {

    VALID("Valid", "Паспорт действителен"),
    NOT_FOUND("NotFound", "По указанным реквизитам паспорта нет данных в МВД"),
    EXPIRED("Expired", "Истек срок действия паспорта"),
    REPLACED("Replaced", "Паспорт был заменен на новый"),
    ISSUED_WITH_VIOLATION("IssuedWithViolation", "Паспорт был выдан с нарушением"),
    WANTED_BY_LAW("WantedByLaw","Паспорт числится в розыске"),
    DESTROYED("Destroyed", "Паспорт изъят, уничтожен"),
    OWNER_DIED("OwnerDied", "Паспорт недействителен в связи со смертью владельца"),
    DEFECTED("Defected", "Технический брак паспорта"),
    LOST("LOST", "Паспорт утрачен");

    private final String key;
    private final String value;

    PassportState(String key, String value) {
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
