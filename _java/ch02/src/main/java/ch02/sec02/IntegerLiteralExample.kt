package ch02.sec02

object IntegerLiteralExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val var1 = 11 //2진수
        val var2 = 134 //8진수
        val var3 = 365 //10진수
        val var4 = 0xB3 //16진수
        println("var1: $var1")
        println("var2: $var2")
        println("var3: $var3")
        println("var4: $var4")
    }
}