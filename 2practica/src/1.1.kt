fun main() {
    // Задаем значения логических величин
    val a = true // A - Истина
    val b = false // B - Ложь
    val c = false // C - Ложь

    // Вычисляем значение логических выражений
    val resultAorB = a || b // A или B
    val resultAandB = a && b // A и B
    val resultBorC = b || c // B или C

    // Выводим результаты
    println("A или B: $resultAorB")
    println("A и B: $resultAandB")
    println("B или C: $resultBorC")
}