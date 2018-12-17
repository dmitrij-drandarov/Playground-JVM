package io.drandarov.playground.jvm.kotlin.operatoroverloading

import kotlin.math.abs
import kotlin.math.sqrt

data class Vector3D(val x: Double, val y: Double, val z: Double) {

    operator fun unaryPlus() = Vector3D(abs(x), abs(y), abs(z))
    operator fun unaryMinus() = Vector3D(-x, -y, -z)

    operator fun plus(d: Double) = Vector3D(x + d, y + d, z + d)
    operator fun minus(d: Double) = Vector3D(x - d, y - d, z - d)
    operator fun times(d: Double) = Vector3D(x * d, y * d, z * d)
    operator fun div(d: Double) = Vector3D(x / d, y / d, z / d)

    operator fun plus(v: Vector3D) = Vector3D(x + v.x, y + v.y, z + v.z)
    operator fun minus(v: Vector3D) = Vector3D(x - v.x, y - v.y, z - v.z)

    fun dotProduct(v: Vector3D) = x * v.x + y * v.y + z * v.z
    fun crossProduct(v: Vector3D) =
        Vector3D(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x)

    fun angle(v: Vector3D) = dotProduct(v) / (length() * v.length())

    fun length() = sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0) + Math.pow(z, 2.0))
    fun normalized() = Vector3D(x / length(), y / length(), z / length())

    override fun toString() =
        "(${if (x >= 0) " $x" else x.toString()},\t" +
         "${if (y >= 0) " $y" else y.toString()},\t" +
         "${if (z >= 0) " $z" else z.toString()})"
}