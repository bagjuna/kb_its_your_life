import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var run = true

    var speed = 0
    while (run) {
        println("----------------")
        println("1. 증속 | 2. 감속 | 3. 정지")
        print("선택: ")

        val strNum: String = scanner.nextLine()
        if (strNum.equals("1")) {
            speed++
            println("현재 속도는 ${speed}km 입니다.")
        } else if (strNum.equals("2")) {
            speed--
            println("현재 속도는 ${speed}km 입니다.")
        } else {
            println("정지합니다.")
            run = false
        }


    }

    println("프로그램 종료")
}