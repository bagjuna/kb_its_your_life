package ch16.sec05.exam03

class Person {
     fun getMember1(creatable: Creatable1): Member? {
        val id = "winter"
        val member = creatable.create(id)
        return member
    }

    fun getMember2(creatable: Creatable2): Member? {
        val id = "winter"
        val name = "한겨울"
        val member = creatable.create(id, name)
        return member
    }
}