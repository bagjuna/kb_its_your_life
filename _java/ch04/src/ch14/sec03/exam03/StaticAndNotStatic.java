package ch14.sec03.exam03;

public class StaticAndNotStatic {
    public static void main(String[] args) {
        NonStaticClass.a1 = 0;
//        NonStaticClass.a2 = 0;
        NonStaticClass.a1 = 0; // static 멤버는 클래스 이름으로 접근 가능
        StaticClass staticAndNotStatic = new StaticClass();
        StaticClass.a1 = 0;

        staticAndNotStatic.a2 = 0;
        StaticClass.staticMethod();
        staticAndNotStatic.nonStaticMethod();


    }
    
    static class StaticClass{
        static int a1 = 0;
        int a2 = 0;
        static void staticMethod(){
            System.out.println("staticMethod");
        }
        void nonStaticMethod(){
            System.out.println("nonStaticMethod");
        }
    }
    
    class NonStaticClass{
        static int a1 = 0;
        int a2 = 0;
    }


}
