package models.checks.dictionaries;

public enum BankruptcyState {

    MONITORING("Monitoring",
            "Наблюдение"),
    FINANCIAL_STABILIZATION("FinancialStabilization",
            "Финансовое оздоровление"),
    EXTERNAL_CONTROL("ExternalControl",
            "Внешнее управление"),
    RECEIVERSHIP_PROCEEDING("ReceivershipProceeding",
            "Конкурсное управление"),
    RECEIVERSHIP_PROCEEDING_FINISHED("ReceivershipProceedingFinished",
            "Конкурсное управление завершено"),
    DEBT_RESTRUCTURING("DebtRestructuring",
            "Реструктуризация долгов"),
    DEBT_RESTRUCTURING_FINISHED("DebtRestructuringFinished",
            "Реструктуризация долгов завершена"),
    PROPERTY_DISPOSAL("PropertyDisposal",
            "Реализация имущества"),
    PROPERTY_DISPOSAL_FINISHED("PropertyDisposalFinished",
            "Реализация имущества завершена"),
    BANKRUPTCY_REFUSED("BankruptcyRefused",
            "Отказано в признании должника банкротом"),
    PROCEEDING_FINISHED("ProceedingFinished",
            "Производство по делу завершено"),
    UNDERFINED_STATE("UnderfindedState",
            "Не удалось определить стадию");

    private final String key;
    private final String value;

    BankruptcyState(String key, String value) {
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
