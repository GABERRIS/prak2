fun main() {
    println("Введите трехзначное число:")
    val number = readLine()!!.toInt()

    if (number in 100..999) {
        val units = number % 10
        val tens = (number / 10) % 10
        val hundreds = number / 100
        val sum = units + tens + hundreds
        val product = units * tens * hundreds

        println("Число единиц: $units")
        println("Число десятков: $tens")
        println("Сумма цифр: $sum")
        println("Произведение цифр: $product")
    } else {
        println("Введено некорректное число. Введите трехзначное число.")
    }
}