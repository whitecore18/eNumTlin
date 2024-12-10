class Month(val name: String, val number: Int) {
    fun getSeason(): Season {
        return when (number) {
            12, 1, 2 -> Season.WINTER
            3, 4, 5 -> Season.SPRING
            6, 7, 8 -> Season.SUMMER
            9, 10, 11 -> Season.FALL
            else -> throw IllegalArgumentException("Неверный номер месяца")
        }
    }
}