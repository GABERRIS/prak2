fun main() {
    // Определяем значения логических величин
    val a = true  // А - Истина
    val b = false // В - Ложь
    val c = false // С - Ложь

    // Вычисляем значения выражений

    // а) не А и В
    val resultA = !a && b
    println("a) не А и В: $resultA")

    // б) А или не В
    val resultB = a || !b
    println("б) А или не В: $resultB")

    // в) А и В или С
    val resultC = a && b || c
    println("в) А и В или С: $resultC")
}