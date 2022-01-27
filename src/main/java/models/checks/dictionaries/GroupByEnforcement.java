package models.checks.dictionaries;

public enum GroupByEnforcement {
    CREDIT_DEBT("CreditDebt","Задолженность по кредитным платежам"),
    APARTMENT_BILL_DEBT("ApartmentBillDebt","Задолженность по платежам за квартиру"),
    ARREST("Arrest", "Арест имущества"),
    MATERIAL_DAMAGE("MaterialDamage", "Материальный ущерб по ГК РФ"),
    TAXES("Taxes", "Взыскание налогов и сборов"),
    INSURANCE_PREMIUMS("InsurancePremiums", "Страховые взносы"),
    FINES("Fines", "Штрафы и гос пошлина, присужденная судом"),
    EMPLOYMENT_RELATIONSHIP("EmploymentRelationship", "Трудовые отношения"),
    OTHER("Other", "Иные задолженности");

    private final String key;
    private final String value;

    GroupByEnforcement(String key, String value) {
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
