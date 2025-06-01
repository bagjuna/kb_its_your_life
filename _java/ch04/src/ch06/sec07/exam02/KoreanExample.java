package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        //Korean 객체 생성
        Korean korean1 = new Korean("박자바", "011225-1234567");
        System.out.println(korean1.nation); //대한민국
        System.out.println(korean1.name); //박자바
        System.out.println(korean1.ssn); //011225-1234567
        //또 다른 Korean 객체 생성
        Korean korean2 = new Korean("김자바", "930525-0654321");
        System.out.println(korean2.nation); //대한민국
        System.out.println(korean2.name); //김자바
        System.out.println(korean2.ssn); //930525-0654321
    }
}