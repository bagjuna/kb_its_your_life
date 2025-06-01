package ch16.sec05.exam03

class Member {
    private val id: String
    private var name: String? = null

    constructor(id: String) {
        this.id = id
        println("Member(String id)")
    }

    constructor(id: String, name: String?) {
        this.id = id
        this.name = name
        println("Member(String id, String name)")
    }

    override fun toString(): String {
        val info = "{ id: $id, name: $name }"
        return info
    }
}