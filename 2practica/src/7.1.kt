fun main() {
    // Задаем значения логических переменных
    val A = true
    val B = false
    val C = false

    // Вычисляем значение выражений
    val resultA = A || !(A && B) || C // Выражение а)
    val resultB = !A || A && (B || C) // Выражение б)
    val resultC = (A || B && !C) && C // Выражение в)

    // Выводим результаты
    println("Результат выражения а): $resultA")
    println("Результат выражения б): $resultB")
    println("Результат выражения в): $resultC")
}