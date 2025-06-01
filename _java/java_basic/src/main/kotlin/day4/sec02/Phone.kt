package day4.sec02

open class Phone {
    // 필드 선언
    var model: String = ""
    var color: String = ""

    // 메소드 선언
    fun bell() {
        println("벨이 울립니다.")
    }

    fun sendVoice(message: String) {
        println("자기: $message")
    }

    fun receiveVoice(message: String) {
        println("상대방: $message")
    }

    fun hangUp() {
        println("전화를 끊습니다.")
    }


}