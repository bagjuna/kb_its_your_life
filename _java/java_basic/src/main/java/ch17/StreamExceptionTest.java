package ch17;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class StreamExceptionTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", null, "b");

//        System.out.println("1. 중간 map - throw new");
//        case1_map_throw(list);

//        System.out.println("\n2. 중간 map - orElseThrow");
//        case2_map_orElseThrow(list);

        System.out.println("\n3. 중간 map - 내부 try-catch");
        case3_map_innerTry(list);

        System.out.println("\n4. 중간 map - 외부 try-catch");
        case4_map_outerTry(list);

//        System.out.println("\n5. 종료 forEach - throw new");
//        case5_terminal_throw(list);

//        System.out.println("\n6. 종료 forEach - orElseThrow");
//        case6_terminal_orElseThrow(list);

        System.out.println("\n7. 종료 forEach - 내부 try-catch");
        case7_terminal_innerTry(list);

        System.out.println("\n8. 종료 forEach - 외부 try-catch");
        case8_terminal_outerTry(list);

//        System.out.println("\n13. filter - throw new");
//        case13_filter_throw(list);

//        System.out.println("\n14. flatMap - throw new");
//        case14_flatMap_throw(list);

//        System.out.println("\n15. peek - throw new");
//        case15_peek_throw(list);

        System.out.println("\n16. filter - 내부 try-catch");
        case16_filter_innerTry(list);

//        System.out.println("\n17. 병렬 스트림 - 내부 throw");
//        case17_parallel_throw(list);

        System.out.println("\n18. 병렬 스트림 - 내부 try-catch");
        case18_parallel_innerTry(list);

//        System.out.println("\n19. Optional + orElseThrow");
//        case19_optional_orElseThrow(list);

//        System.out.println("\n20. collect 내부 throw");
//        case20_collect_throw(list);
    }

    static String process(String item) {
        if (item == null) throw new NullPointerException("null item");
        return "processed_" + item;
    }

    // 안전한 매퍼 함수
    static <T, R> Function<T, R> safeMap(Function<T, R> mapper, R fallback) {
        return t -> {
            try {
                return mapper.apply(t);
            } catch (Exception e) {
                return fallback;
            }
        };
    }

    // 각 케이스 함수 정의들
    static void case1_map_throw(List<String> list) {
        list.stream().map(StreamExceptionTest::process).forEach(System.out::println);
    }

    static void case2_map_orElseThrow(List<String> list) {
        list.stream().map(s -> Optional.ofNullable(s).map(StreamExceptionTest::process).orElseThrow()).forEach(System.out::println);
    }

    static void case3_map_innerTry(List<String> list) {
        list.stream().map(s -> {
            try {
                return process(s);
            } catch (Exception e) {
                return "예외발생";
            }
        }).forEach(System.out::println);
    }

    static void case4_map_outerTry(List<String> list) {
        try {
            list.stream().map(StreamExceptionTest::process).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("외부 catch: " + e);
        }
    }

    static void case5_terminal_throw(List<String> list) {
        list.stream().map(StreamExceptionTest::process).forEach(s -> {
            if (s.contains("b")) throw new RuntimeException("b 처리 실패");
            System.out.println(s);
        });
    }

    static void case6_terminal_orElseThrow(List<String> list) {
        list.stream().map(StreamExceptionTest::process).forEach(s ->
                Optional.ofNullable(s).orElseThrow()
        );
    }

    static void case7_terminal_innerTry(List<String> list) {
        list.stream()
            .forEach(s -> {
                try {
                    if (s==null) throw new RuntimeException("null 처리 실패");
                    System.out.println(s);
                } catch (Exception e) {
                    System.out.println("예외 캐치: " + e);
                }
            });
    }

    static void case8_terminal_outerTry(List<String> list) {
        try {
            list.stream().map(StreamExceptionTest::process).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("forEach 외부 catch: " + e);
        }
    }

    static void case13_filter_throw(List<String> list) {
        list.stream().filter(s -> {
            if (s == null) throw new NullPointerException("null in filter");
            return true;
        }).forEach(System.out::println);
    }

    static void case14_flatMap_throw(List<String> list) {
        list.stream().flatMap(s -> {
            if (s == null) throw new NullPointerException("null in flatMap");
            return Stream.of(s);
        }).forEach(System.out::println);
    }

    static void case15_peek_throw(List<String> list) {
        list.stream().peek(s -> {
            if (s == null) throw new NullPointerException("null in peek");
        }).forEach(System.out::println);
    }

    static void case16_filter_innerTry(List<String> list) {
        list.stream().filter(s -> {
            try {
                return s != null;
            } catch (Exception e) {
                return false;
            }
        }).forEach(System.out::println);
    }

    static void case17_parallel_throw(List<String> list) {
        list.parallelStream().map(StreamExceptionTest::process).forEach(System.out::println);
    }

    static void case18_parallel_innerTry(List<String> list) {
        list.parallelStream().map(s -> {
            try {
                return process(s);
            } catch (Exception e) {
                return "병렬 예외";
            }
        }).forEach(System.out::println);
    }

    static void case19_optional_orElseThrow(List<String> list) {
        list.stream().map(s -> Optional.ofNullable(s).orElseThrow()).forEach(System.out::println);
    }

    static void case20_collect_throw(List<String> list) {
        list.stream().collect(Collectors.collectingAndThen(Collectors.toList(), r -> {
            if (r.contains(null)) throw new RuntimeException("null in collect");
            return r;
        }));
    }

}