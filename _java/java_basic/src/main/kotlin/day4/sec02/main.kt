package day4.sec02

fun main() {
    // SmartPhone 객체 생성
    val myPhone = SmartPhone("갤럭시", "은색")
    // Phone으로부터 상속받은 필드 읽기
    println("모델: ${myPhone.model}")
    println("색상: ${myPhone.color}")
    // SmartPhone의 필드 읽기
    println("와이파이 상태: ${myPhone.wifi}")
    // Phone으로부터 상속받은 메소드 호출
    myPhone.bell()
    myPhone.sendVoice("여보세요.")
    myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.")
    myPhone.sendVoice("아~ 네, 반갑습니다.")
    myPhone.hangUp()
    // SmartPhone의 메소드 호출
    myPhone.wifi = false
    myPhone.internet()
}