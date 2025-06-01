package ch06.sec08.exam03;

public class Car {
    int gas;

    // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    void setGas(int gas) {
        // gas 필드값을 매개변수로 받은 gas 값으로 변경
        this.gas = gas;
    }

    // 리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
    // 리턴하기전 조건에 따라 "gas가 없습니다" 또는 "gas가 없습니다" 출력
    boolean isLeftGas() {
        // gas 필드값이 0이면 false를 리턴
        if (gas == 0) {
            System.out.println("gas가 없습니다");
            return false;
        } else {
            // gas 필드값이 0이 아니면 true를 리턴
            System.out.println("gas가 있습니다");
            return true;
        }
    }

    // 무한 루프를 돌면서 루프를 한 번 돌 때마다 gas의 값은 1 감소
    // 주행이 가능한 상태라면"달립니다.(gas잔량: xxx)" 출력
    // 주행할 수 없는 상태라면"멈춥니다.(gas잔량: xxx)" 출력 후 메소드를 종료
    void run() {
        System.out.println("출발합니다.");
        while (true) {
            // gas 필드값이 0이면 false를 리턴
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량: " + gas + ")");
                gas--;
            } else {
                System.out.println("멈춥니다.(gas잔량: " + gas + ")");
                System.out.println("gas를 주입하세요.");
                return;
            }
        }
    }

}