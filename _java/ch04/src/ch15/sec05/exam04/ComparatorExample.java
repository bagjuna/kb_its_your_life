package ch15.sec05.exam04;

import java.util.ArrayList;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        // 포도, 3000
        // 수박, 10000
        // 딸기, 6000

        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit("포도", 3000));
        list.add(new Fruit("수박", 10000));
        list.add(new Fruit("딸기", 6000));

        list.sort(new FruitComparator());
        for (Fruit fruit : list) {
            System.out.println(fruit.name + ":" + fruit.price);
        }


    }
}