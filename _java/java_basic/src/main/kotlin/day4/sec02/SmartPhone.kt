package day4.sec02

class SmartPhone(model: String, color: String) : Phone() {
    // 필드 선언
    var wifi: Boolean = false
        set(value) {
            field = value
            println("와이파이 상태를 변경했습니다.")
        }
    // 생성자 선언 (초기화 블록)
    init {
        // 부모 클래스 Phone의 model, color 필드를 초기화
        this.model = model
        this.color = color
    }

    fun internet() {
        println("인터넷에 연결합니다.")
    }
}