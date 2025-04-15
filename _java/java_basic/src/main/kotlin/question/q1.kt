package question

fun main() {
    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    println()
    for (i in 5 downTo 1) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}