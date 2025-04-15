package ch02.sec13

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("x 값 입력: ")
    val strX: String = scanner.nextLine()
    val x = strX.toInt()
    print("y 값 입력: ")
    val strY: String = scanner.nextLine()
    val y = strY.toInt()
    val result = x + y

    println("x + y: $result")
    println()

    while (true) {
        println("입력 문자열: ")
        val data = scanner.nextLine()
        if (data.equals("q")) {
            break
        }
        println("출력 문자열 : $data")
    }
    println("종료")


}