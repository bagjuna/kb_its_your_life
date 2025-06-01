package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        // Product<Car, String> car = new Product<Car, String>("자동차", "현대자동차");
        Product<Car, String> car = new Product<>();
        car.setKind(new Car());
        car.setModel("현대자동차");
        System.out.println(car.getKind().getClass());
        System.out.println(car.getModel());

        // Product<Tv, String> tv = new Product<Tv, String>("TV", "삼성전자");
        Product<Tv, String> tv = new Product<>();
        tv.setKind(new Tv());
        tv.setModel("삼성전자");
        System.out.println(tv.getKind().getClass());
        System.out.println(tv.getModel());
    }
}