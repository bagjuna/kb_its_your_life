
public class Main3 {
    public static void main(String[] args) {
        String[] strs = new String[1];
        strs[0] = "a";
        String str = "b";

        f1(strs, str);
        System.out.println(strs[0]); // Output: a
        System.out.println(str); // Output: b
    }

    static void f1(String[] strs, String str) {
        strs[0] = str;
        str = "changed";
    }


}
