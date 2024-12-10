fun countRepeatedCharacters(input: String): Map<Char, Int> {
    val characterCount = mutableMapOf<Char, Int>()

    // Подсчет количества вхождений каждого символа
    for (char in input) {
        characterCount[char] = characterCount.getOrDefault(char, 0) + 1
    }

    // Фильтрация символов, которые повторяются
    return characterCount.filter { it.value > 1 }
}

fun main() {
    val months = listOf(
        Month("Январь", 1),
        Month("Февраль", 2),
        Month("Март", 3),
        Month("Апрель", 4),
        Month("Май", 5),
        Month("Июнь", 6),
        Month("Июль", 7),
        Month("Август", 8),
        Month("Сентябрь", 9),
        Month("Октябрь", 10),
        Month("Ноябрь", 11),
        Month("Декабрь", 12)
    )

    while (true) {
        // Запрос месяца
        println("Введите номер месяца (1-12):")
        val monthInput = readLine()

        if (monthInput != null) {
            val monthNumber = monthInput.toIntOrNull()
            if (monthNumber != null && monthNumber in 1..12) {
                val month = months[monthNumber - 1]
                val season = month.getSeason()
                println("Месяц: ${month.name}, Время года: $season")
            } else {
                println("Пожалуйста, введите корректный номер месяца.")
                continue
            }
        }

        // Запрос строки для подсчета повторяющихся символов
        val inputString = "Шумоизоляция"
        val repeatedCharacters = countRepeatedCharacters(inputString)

        if (repeatedCharacters.isNotEmpty()) {
            println("Повторяющиеся символы в строке '$inputString':")
            for ((char, count) in repeatedCharacters) {
                println("Символ '$char' повторяется $count раз(а).")
            }
        } else {
            println("Нет повторяющихся символов в строке '$inputString'.")
        }

        // Запрос на продолжение
        println("Хотите продолжить? 1. Продолжить; 2. Закончить программу.")
        val choice = readLine()
        if (choice != "1") {
            println("Программа завершена.")
            break
        }
    }
}