fun main() {
    // Получаем два числа от пользователя
    println("Введите первое число:")
    val num1 = readLine()!!.toDouble()

    println("Введите второе число:")
    val num2 = readLine()!!.toDouble()

    // Проверяем, что второе число не равно нулю
    if (num2 == 0.0) {
        println("Деление на ноль недопустимо!")
    } else {
        // Делим первое число на второе
        val result = num1 / num2

        // Выводим результат
        println("$num1 / $num2 = $result")
    }
}