package models.checks.dictionaries;

public enum RelationshipType {

    DIRECTOR("Director",
            "Руководитель"),
    FOUNDER("Founder",
            "Учредитель"),
    INDIVIDUAL_ENTREPRENEUR("IndividualEntrepreneur",
            "Индивидуальный предприниматель");

    private final String key;
    private final String value;

    RelationshipType(String key, String value) {
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
