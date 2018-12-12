fun main(args: Array<String>) {
    val oneTo10 = 1..10
    val alpha = "A".."Z"
    println("test: ${"R" in alpha}")

    val tenTo1 = 10.downTo(1)
    tenTo1.forEach { i -> print(i)}
    println()

    val twoTo20 = 2.rangeTo(20)
    val rng3 = oneTo10.step(3)

    for (x in rng3) println("$x ")

    for (x in tenTo1.reversed()) print("$x ")
    println()
    tenTo1.reversed().forEach { i: Int -> print("$i ") }
    println()
}