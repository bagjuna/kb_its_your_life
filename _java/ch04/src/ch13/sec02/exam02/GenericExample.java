package ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        CarAgency carAgency = new CarAgency();
        Car rent = carAgency.rent();
        rent.run();

        HomeAgency homeAgency = new HomeAgency();
        Home rent2 = homeAgency.rent();
        rent2.turnOnLight();
    }


}