fun main() {
    // Задаем значения логических переменных
    val x = false 
    val y = false
    val z = true

    // а) X или Y и не Z
    val a = x || (y && !z)
    println("a) $a")

    // б) не X и не Y
    val b = !x && !y
    println("b) $b")

    // в) не (X и Z) или Y
    val c = !(x && z) || y
    println("c) $c")

    // г) X и не Y или Z
    val d = x && !y || z
    println("d) $d")

    // д) X и (не Y или Z)
    val e = x && (!y || z)
    println("e) $e")

    // е) X или (не (Y или Z))
    val f = x || !(y || z)
    println("f) $f")
}