package io.drandarov.playground.jvm.kotlin.billionlaughs

fun main(args: Array<String>) {
    val lol1 = "lol"
    val lol2 = "$lol1$lol1$lol1$lol1$lol1$lol1$lol1$lol1$lol1$lol1"
    val lol3 = "$lol2$lol2$lol2$lol2$lol2$lol2$lol2$lol2$lol2$lol2"
    val lol4 = "$lol3$lol3$lol3$lol3$lol3$lol3$lol3$lol3$lol3$lol3"
    val lol5 = "$lol4$lol4$lol4$lol4$lol4$lol4$lol4$lol4$lol4$lol4"
    val lol6 = "$lol5$lol5$lol5$lol5$lol5$lol5$lol5$lol5$lol5$lol5"
    val lol7 = "$lol6$lol6$lol6$lol6$lol6$lol6$lol6$lol6$lol6$lol6"
    val lol8 = "$lol7$lol7$lol7$lol7$lol7$lol7$lol7$lol7$lol7$lol7"
    println(lol8.length)
    // Uncommenting anything below crashes IntelliJ
//    val lol9 = "$lol8$lol8$lol8$lol8$lol8$lol8$lol8$lol8$lol8$lol8"
//    println(lol9.length)
//    val lol10 = "$lol9$lol9$lol9$lol9$lol9$lol9$lol9$lol9$lol9$lol9"
//    println(lol10.length)
}