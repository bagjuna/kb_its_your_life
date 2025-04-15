fun main(){
    val grade = "B"

//Java 11 이전 문법
    var score1 = 0
    when (grade) {
        "A" -> score1 = 100
        "B" -> {
            val result = 100 - 20
            score1 = result
        }
        else -> score1 = 60

    }
    println("score1: ${score1}")
}