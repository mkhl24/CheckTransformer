package models.checks.dictionaries;

public enum FoundBy {

    FIO("Fio", "ФИО физического лица"),
    FIO_AND_DATE_BIRTH("FioAndDateBirth","ФИО и дата рождения физического лица"),
    NAME("Name","Название юридического лица"),
    NAME_AND_INN("NameAndInn", "Название и ИНН юридического лица");

    private final String key;
    private final String value;

    FoundBy(String key, String value) {
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
