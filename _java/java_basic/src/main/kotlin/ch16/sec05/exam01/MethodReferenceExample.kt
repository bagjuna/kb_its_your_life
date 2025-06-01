package ch16.sec05.exam01

object MethodReferenceExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val person = Person()
        //정적 메소드일 경우
        val com = Computer()

        //람다식
        person.action { x: Double, y: Double -> Computer.staticMethod(x, y) }
        // 메소드 참조
        person.action { x: Double, y: Double -> Computer.staticMethod(x, y) }

        //인스턴스 메소드일 경우
        //람다식
//        person.action((x, y) -> com.instanceMethod(x, y));

        // 메소드 참조
        person.action { x: Double, y: Double -> com.instanceMethod(x, y) }
    }
}
