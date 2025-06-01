package ch06.sec09;


public class CarExample {
    public static void main(String[] args) {
        Car car = new Car("테슬라");
        car.setSpeed(60);
        System.out.println(car.getSpeed()+"km/h");
        car.run();
    }
}
