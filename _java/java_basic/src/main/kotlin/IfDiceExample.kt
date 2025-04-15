
fun main(){
    val num = (Math.random() * 6).toInt() + 1 // 주사위 번호 뽑기
    if(num ==1){
        println("주사위 번호는 1입니다.")
    } else if(num ==2){
        println("주사위 번호는 2입니다.")
    } else if(num ==3){
        println("주사위 번호는 3입니다.")
    } else if(num ==4){
        println("주사위 번호는 4입니다.")
    } else if(num ==5){
        println("주사위 번호는 5입니다.")
    } else{
        println("주사위 번호는 6입니다.")
    }
}