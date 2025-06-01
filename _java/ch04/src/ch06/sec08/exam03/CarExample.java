package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.setGas(5); // gas 필드값을 5로 변경
        boolean gasState = car.isLeftGas(); // gas 필드값이 0이 아니므로 true 리턴
        car.run();
    }
}