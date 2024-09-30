fun main() {
    // Определяем значения переменных
    val x = true
    val y = true
    val z = false

    // a) не X и Y
    val resultA = !x && y
    println("a) !x && y = $resultA")

    // б) Х или не Y
    val resultB = x || !y
    println("б) x || !y = $resultB")

    // в) Х или Y и Z
    val resultC = x || (y && z)
    println("в) x || (y && z) = $resultC") 
}