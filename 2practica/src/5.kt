import kotlin.math.sqrt

fun main() {
    // Ввод числа от пользователя
    println("Введите число:")
    val number = readLine()?.toDoubleOrNull() ?: 0.0

    // Проверка на отрицательное число
    if (number < 0) {
        println("Ошибка: нельзя найти корень из отрицательного числа.")
        return // Выход из программы, если число отрицательное
    }

    // Вычисление квадратного корня
    val squareRoot = sqrt(number)

    // Вывод результата
    println("Квадратный корень из $number равен $squareRoot")
}