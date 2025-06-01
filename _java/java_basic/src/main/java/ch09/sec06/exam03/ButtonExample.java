package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성

        Button btnOk = new Button();
        //Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 객체
        class okClickListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼 클릭");
            }
        }
        //Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 객체 대입
        btnOk.setClickListener(new okClickListener());
        //Ok 버튼 클릭하기
        btnOk.click();
    }

    private static void onClick() {
        System.out.println("Ok 버튼 클릭하였습니다.");
    }
}