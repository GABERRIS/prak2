fun main() {
    println("Введите двузначное число:")
    val number = readLine()!!.toInt()

    // Проверка на двузначность
    if (number < 10 || number > 99) {
        println("Введенное число не является двузначным.")
        return
    }

    // Нахождение десятков и единиц
    val tens = number / 10
    val units = number % 10

    // Вывод результатов
    println("Число десятков: $tens")
    println("Число единиц: $units")
    println("Сумма цифр: ${tens + units}")
    println("Произведение цифр: ${tens * units}")
}