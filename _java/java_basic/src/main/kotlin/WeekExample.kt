import java.util.*

fun main() {   //Week 열거 타입 변수 선언
    var today: Week? = null

    //Calendar 얻기
    var cal: Calendar = Calendar.getInstance()

    //오늘의 요일 얻기(1~7)
    var week: Int = cal[Calendar.DAY_OF_WEEK]
    println("오늘의 요일: $week")

    //숫자를 열거 상수로 변환해서 변수에 대입
    when (week) {
        1 -> today = Week.SUNDAY
        2 -> today = Week.MONDAY
        3 -> today = Week.TUESDAY
        4 -> today = Week.WEDNESDAY
        5 -> today = Week.THURSDAY
        6 -> today = Week.FRIDAY
        7 -> today = Week.SATURDAY
    }
    if (today == Week.SUNDAY) {
        println("오늘은 일요일입니다. 영화를 봅시다.")
    } else {
        println("오늘은 ${today}입니다. 공부합시다.")
    }


}