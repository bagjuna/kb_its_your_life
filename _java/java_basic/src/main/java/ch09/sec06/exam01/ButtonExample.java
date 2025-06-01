package ch09.sec06.exam01;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
        Button button = new Button(); // 클릭 이벤트 발생

        button.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼 클릭");
            }
        });
        button.touch();
    }
}