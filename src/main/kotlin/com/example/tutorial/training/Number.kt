package com.example.tutorial.training

import kotlin.math.*

fun typeNumber() {
    val doubleNumber: Double = E
    val floatNumber: Float
    val num1 = 0.222f
    floatNumber = log10(num1)

    val longNumber: Long = 10000000000000
    val intNumber = 3
    print(doubleNumber)
    print(num1)
    print(floatNumber)
    print(longNumber)
    print(intNumber)
}

fun powNumber() {
    val base = 2.5
    val exponent = 2.001
    val result = base.pow(exponent)
    println(result)
}

// 全ての数値型は次の変換をサポートしている
@SuppressWarnings("unused")
fun convertInt() {
    val intNumber = 3
    // toByte
    println("toByte %02X".format(intNumber.toByte()))

//    print(String.format("toShort %d"),intNumber.toShort())

    println("int %d".format(intNumber))
    // toLong
    println("toLong %02d".format(intNumber.toLong()))

    // toFloat
    println("toFloat %e".format(intNumber.toFloat()))
    // toDouble
    println("toDouble %f".format(intNumber.toDouble()))
    // toChar
    println("toChar %s".format(intNumber.toChar().toString()))
}

// manipulate
fun manipulateInt() {
    val a = 10
    val b = 4
    val result = a/b
    // Int同士の割り算はIntが返る
    print(result)
}

fun boxing(): Boolean {
    // null許容型な数値参照
    // セーフコール演算子をつける事でNullPointerExceptionを回避できるが、
    // 非null型をnull許容型に代入すると、暗黙的に型変換されてしまう
    val a = 1000
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    // boxedAとanotherBoxedAは同値だが、同一ではない。
    return boxedA === anotherBoxedA
}
