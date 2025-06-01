package ch00.day3;

class A{
    public void method() {
        System.out.println("Method A");
    }
}

class B extends A{
    public void method() {
        System.out.println("Method B");
        super.method();
    }
}

class C extends B{
    public void method() {
        System.out.println("Method C");
        super.method();

    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

//        a.method(); // Output: Method A
//        b.method(); // Output: Method B
        c.method(); // Output: Method C
    }

}

