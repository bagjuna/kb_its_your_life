import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    // 배열은 문제 없음 - 배열은 공변성을 가짐
    public static void printArray(Object[] arr) {
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }

    // 제네릭은 컴파일 오류 발생 - 제네릭은 무공변성을 가짐
    public static void printList(List<? extends Number> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // printList(integers); // 컴파일 오류! - List<Integer>는 List<Object>의 하위 타입이 아님
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        printArray(integers); // OK - Integer[]는 Object[]의 하위 타입
        List<Integer> integers2 = Arrays.asList(1, 2, 3);
        printList(integers2); // 컴파일 오류! - List<Integer>는 List<Object>의 하위 타입이 아님


        List<? extends Number> upperList = new ArrayList<Integer>();
        Number n = upperList.get(0); // 읽기 OK
//        upperList.add(1); // 컴파일 오류! (쓰기 불가)

        // 하한 경계 와일드카드
        List<? super Integer> lowerList = new ArrayList<Number>();
        lowerList.add(1); // 쓰기 OK
        Object obj = lowerList.get(0); // 읽기는 Object 타입으로만
        // 비한정 와일드카드
        List<?> list = new ArrayList<String>();
        Object o = list.get(0); // 읽기는 Object 타입으로만
//        list.add("test"); // 컴파일
    }
}
