fun main() {
    // Определяем значения переменных
    val x = false
    val y = true
    val z = false

    // Вычисляем значение логических выражений
    val a = x || z
    val b = x && y
    val c = x && z

    // Выводим результаты
    println("a) X или Z: $a")
    println("b) X и Y: $b")
    println("c) X и Z: $c")
}