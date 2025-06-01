package ch06.sec07.exam04;

public class Car {
    //필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 디폴트 생성자
    public Car() {
    }

    // 매개변수 model만 받는 생성자
    public Car(String model) {
        this.model = model;
    }
    // 매개변수 model과 color를 받는 생성자
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    // 매개변수 model, color, maxSpeed를 받는 생성자
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}