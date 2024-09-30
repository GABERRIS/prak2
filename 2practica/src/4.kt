fun main() {
    // Запрашиваем у пользователя число
    println("Введите число:")
    val number = readLine()!!.toInt()

    // Запрашиваем у пользователя степень
    println("Введите степень:")
    val power = readLine()!!.toInt()

    // Вычисляем степень числа
    val result = Math.pow(number.toDouble(), power.toDouble()).toInt()

    // Выводим результат
    println("$number в степени $power равно $result")
}