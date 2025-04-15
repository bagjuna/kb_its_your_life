package ch03.sec07


fun main(){
    val charCode = 'A'.code

//int charCode = 'a';
//int charCode = '5';
    if ((65 <= charCode) and (charCode <= 90)) {
        println("대문자이군요.")
    }
    if ((97 <= charCode) && (charCode <= 122)) {
        println("소문자이군요.")
    }
    if ((48 <= charCode) && (charCode <= 57)) {
        println("0~9 숫자이군요.")
    }
}