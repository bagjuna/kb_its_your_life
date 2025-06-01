package day4.questions

class Database {
    private val connection = "MySQL"
    fun connect(): String {
        println(connection + "에 연결합니다.")
        return connection
    }

    fun close() {
        println(connection + "을 닫습니다.")
    }
}