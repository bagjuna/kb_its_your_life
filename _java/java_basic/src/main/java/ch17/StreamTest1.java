package ch17;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {

        Stream<Integer> infinite =
                Stream.iterate(0, n -> n + 2);

         Stream.iterate(
                0, // 초기값
                n -> n < 100, // 종료 조건
                n -> n + 1 // 다음 요소 생성
        ).forEach(System.out::println);

        // 무한 스트림을 10개만 생성
//        infinite.limit(10)
//                .forEach(System.out::println);


    }
}
