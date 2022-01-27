package models.checks.dictionaries;

public enum ProceedingType {
    CRIMINAL_CASES("CriminalCases", "Уголовные дела"),
    AC_CASES("AdministrativeAndCivilCases", "Административные и гражданские дела"),
    ADMINISTRATIVE_OFFENCES("AdministrativeOffences", "Административные правонарушения"),
    UNDEFINED("Undefined", "Не удалось определить тип судопроизводства");

    private final String key;
    private final String value;

    ProceedingType(String key, String value) {
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
