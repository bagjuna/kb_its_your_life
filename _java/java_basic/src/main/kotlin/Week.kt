enum class Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    fun isWeekend(): Boolean {
        return this == SATURDAY || this == SUNDAY
    }
}