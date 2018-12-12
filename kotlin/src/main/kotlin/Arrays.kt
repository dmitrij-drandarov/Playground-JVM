fun main(args: Array<String>) {
    val arrayOf: Array<Any> = arrayOf("test", 2.5f, 2.7, 6)
    println(arrayOf.map(Any::toString))

    var test = Array(10, {x -> x * x })

    println(test.map { it.toString() })

    test = Array(10) { x -> x * x }

    println(test.map { it.toString() })

    println(test.map(Int::toString).filter({ s: String -> s.contains("4") }))

    println(test.map { it.toString() }.filter { s -> s.startsWith("1") })

    println(test.map(Int::toString).filter { it.startsWith("1") })
}