package day4.questions

fun main(){
    val db = Database()
    db.connect()
    db.close()

    val db2 = Database()
    db2.connect()
    db2.close()


}