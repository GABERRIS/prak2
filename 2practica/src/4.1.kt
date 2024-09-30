fun main() {
    // Определяем логические переменные с заданными значениями
    val x = true // Х - Истина
    val y = true // Y - Истина
    val z = false // Z - Ложь

    // а) не Х и Y
    val resultA = !x && y
    println("Результат а): $resultA")

    // б) Х или не Y
    val resultB = x || !y
    println("Результат б): $resultB")

    // в) Х или Y и Z
    val resultC = x || (y && z)
    println("Результат в): $resultC")
}