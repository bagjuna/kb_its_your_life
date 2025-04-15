import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numStr = scanner.nextLine()
    val divNum = scanner.nextInt()
    val frontStr = numStr.substring(0, numStr.length - 2)
    var back = 0
    while (back < 100) {
        var backStr = back.toString()
        if(back < 10) {
            backStr = "0$back"
        } else {
            backStr = "$back"
        }
        val num = frontStr + backStr
        if (num.toInt() % divNum == 0) {
            println(backStr)
            break
        }
        back++
    }


}