fun main(){
    val score = 75
    if (score >= 90) {
        println("점수가 100~90입니다.")
        println("등급은 A입니다.")
    } else if (score >= 80) { // 80 <= score < 90일 경우
        println("점수가 80~89입니다.")
        println("등급은 B입니다.")
    } else if (score >= 70) { // 70 <= score < 80일 경우
        println("점수가 70~79입니다.")
        println("등급은 C입니다.")
    } else { // score < 70일 경우
        println("점수가 70 미만입니다.")
        println("등급은 D입니다.")
    }
}