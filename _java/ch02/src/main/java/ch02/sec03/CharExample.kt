package ch02.sec03

object CharExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val c1 = 'A' //문자 저장
        val c2 = 65.toChar() //유니코드 직접 저장
        val c3 = '가'
        val c4 = 44032.toChar() //문자 저장

        //유니코드 직접 저장
        println(c1)
        println(c2)
        println(c3)
        println(c4)


    }
}

