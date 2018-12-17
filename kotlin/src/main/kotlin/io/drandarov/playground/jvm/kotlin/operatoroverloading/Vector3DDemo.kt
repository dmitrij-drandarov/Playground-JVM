package io.drandarov.playground.jvm.kotlin.operatoroverloading

import java.lang.Math.toDegrees
import kotlin.math.acos

fun main(args: Array<String>) {
    val vec = Vector3D(1.0, 2.0, -1.5)

    println("vec:\t$vec")
    println("-vec:\t${-vec}")
    println("+vec:\t${+vec}")
    println()

    println("vec:\t$vec")
    println("vec + 2:\t${vec + 2.0}")
    println("vec - 2:\t${vec - 2.0}")
    println("vec * 2:\t${vec * 2.0}")
    println("vec / 2:\t${vec / 2.0}")
    println()

    println("vec:\t$vec")
    println("vec length:\t${vec.length()}")
    println("vec normal:\t${vec.normalized()}")
    println("vec normal length:\t${vec.normalized().length()}")
    println()

    val vec2 = Vector3D(2.0, 1.5, 3.0)

    println("vec:\t$vec")
    println("vec2:\t$vec2")
    println("vec + vec2:\t${vec + vec2}")
    println("vec - vec2:\t${vec - vec2}")
    println("vec += vec2\t${vec + vec2} (New Object, with only x, y, z kept)")
    println()

    println("vec:\t$vec")
    println("vec2:\t$vec2")
    println("vec • vec2:\t${vec.dotProduct(vec2)}")
    println("vec x vec2:\t${vec.crossProduct(vec2)}")
    println("vec angle vec2 (cos):\t${vec.angle(vec2)}")
    println("vec angle vec2 in rad:\t${acos(vec.angle(vec2))}")
    println("vec angle vec2 in deg:\t${toDegrees(acos(vec.angle(vec2)))}")
    println()

    val vec3 = Vector3D(-1.0, -2.0, 1.5)

    println("vec:\t$vec")
    println("vec2:\t$vec2")
    println("vec3:\t$vec3")
    println("vec == vec2:\t${vec == vec2}")
    println("vec != vec3:\t${vec != vec3}")
    println("vec == -vec3:\t${vec == -vec3}")
    println()
}
