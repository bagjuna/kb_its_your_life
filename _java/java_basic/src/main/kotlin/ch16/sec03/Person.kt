package ch16.sec03

class Person {
    fun action1(workable: Workable) {
        workable.work("홍길동", "프로그래밍")
    }

    fun action2(speakable: Speakable) {
        speakable.speak("안녕하세요")
    }
}