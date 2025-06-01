package ch14.sec03.exam03;

public class OuterEx {
    public static void main(String[] args) {

        Outer.staticMethod();  // static 메서드 호출
        System.out.println(Outer.staticValue);  // static 필드 호출

        // Outer
        Outer.StaticInner obj1 = new Outer.StaticInner();
        Outer.StaticInner obj2 = new Outer.StaticInner();
        System.out.println(obj1.num); // 10
        System.out.println(Outer.staticValue); // 100
        obj1.num = 20;

        
    }
}
