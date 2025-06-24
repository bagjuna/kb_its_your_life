import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main3 {
   static HashSet <List<String>> set = new HashSet<>();
    public static void main(String[] args) {
        List<String> crews1 = new ArrayList<>(List.of("A", "B", "C"));
        set = new HashSet<>();
        set.add(crews1);
        List<String> crews3 = List.copyOf(crews1);
        crews1.add("D"); // UnsupportedOperationException
        crews1.remove(crews1.size() - 1);
        System.out.println(set.contains(crews3));
    }



}
