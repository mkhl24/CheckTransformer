package models.checks.dictionaries;

public enum GroupByCategory {

    BANKRUPTCY("Bankruptcy", "Процедура банкротства"),
    LOAN("Loan", "Обязательства по договорам займа, кредита, лизинга"),
    TAXES("Taxes", "Налоги"),
    SERVICES_AGREEMENT("ServicesAgreement", "Обязательства по договорам на оказание услуг"),
    SUPPLY_AGREEMENT("SupplyAgreement", "Обязательства по договорам поставки");

    private final String key;
    private final String value;

    GroupByCategory(String key, String value) {
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
