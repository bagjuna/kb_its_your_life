package ch00.day3.sec00;

abstract class Vehicle {
    String name;

    abstract public String getName(String val);

    public String getName() {
        return "Vehicle Name : " + name;
    }
}

class Car extends Vehicle {
    private String name;

    public Car(String name) {
        this.name = super.name = name;
    }

    public String getName(String val) {
        return "Car Name : " + val;
    }

    public String getName() {
        return "Car Name : " + name;
    }

    public String getName(byte[] val) {
        return "Car Name : " + val;
    }
}

public class Test {
    public static void main(String[] args) {
        int a[] = {75, 96, 82};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        switch (10) {
            case 10:
            case 9:
                System.out.print("A");
            case 8:
                System.out.print("B");
            case 7:
            case 6:
                System.out.print("C");
            default:
                System.out.println("D");
        }
    }
}
