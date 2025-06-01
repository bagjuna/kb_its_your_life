package template;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World");
        AbstractDisplay d3 = new StringDisplay("안녕하세요");
        d1.display();
        d2.display();
        d3.display();
        StringBuilder sb = new StringBuilder("sfd");
        char c = 'a';
        sb.append(c);
        System.out.println(sb);
    }
}
