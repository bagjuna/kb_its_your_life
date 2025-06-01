package ch15.sec05.exam03;

import java.util.*;

import static java.util.Comparator.comparing;

public class ComparableExample {
    public static void main(String[] args) {
        // 홍길동, 35
        // 감자바, 25
        // 박지원, 31
        List<Person> list = new LinkedList<>();
        list.add(new Person("홍길동", 35));
        list.add(new Person("감자바", 25));
        list.add(new Person("박지원", 31));
        list.add(new Person("김지원", 31));

        list = list.stream().sorted(comparing(p -> p.age)).sorted(comparing(p -> p.name)).toList();

        // 정렬
        for (Person person : list) {
            System.out.println(person.name + ":" + person.age);
        }

//        TreeSet<Person> set = new TreeSet<>();
//        set.add(new Person("홍길동", 35));
//        set.add(new Person("감자바", 25));
//        set.add(new Person("박지원", 31));
//
//        for (Person person : set) {
//            System.out.println(person.name + ":" + person.age);
//        }

    }
}