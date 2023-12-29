package ru.organization.fishing;

public enum CrewMemberPositions {
    SECOND_ENGINEER ("второй механик"),
    SECOND_OFFICER ("второй помощник"),
    THIRD_ENGINEER ("третий механик"),
    THIRD_OFFICER ("третий помощник"),
    FOURTH_ENGINEER ("четвертый механик"),
    BOATSWAIN ("боцман"),
    CADET ("кадет"),
    CHIEF_COOK ("шеф повар"),
    CHIEF_ENGINEER ("старший механик"),
    CHIEF_FISH_MASTER ("старший мастер обработки"),
    CHIEF_OFFICER ("старший помощник"),
    COOK_AB ("повар-матрос"),
    CRANE_OPERATOR ("оператор крана"),
    DONKERMAN ("донкерман"),
    ELECTRO_ENGINEER ("электромеханик"),
    FISH_MATE ("промысловик"),
    FITTER ("моторист-газосварщик"),
    GAS_ENGINEER ("инженер-газовик"),
    MASTER ("капитан"),
    MEDICAL_OFFICER ("врач"),
    MESSMAN ("работник кухни"),
    MOTORMAN ("моторист"),
    MOTORMAN_WELDER ("моторист-газоэлектросварщик"),
    PUMPMAN ("оператор насосной установки"),
    RADIO_OFFICER ("помощник капитана по радиоэлектронике"),
    REFRIGERATOR_ENGINEER ("рефмеханик"),
    SEAMEN ("матрос"),
    SEAMEN_MOTORMAN ("матрос-моторист"),
    SEAMEN_WELDER ("матрос-сварщик"),
    SHIFT_ENGINEER ("сменный механик"),
    SHIFT_OFFICER ("сменный помощник"),
    TURNER_MOTORMAN ("токарь-моторист"),
    WIPER ("уборщик");

    private final String name;

    CrewMemberPositions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
