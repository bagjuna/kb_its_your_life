package ch15;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(0);
        set.add(5);
        for (Integer i : set) {
            System.out.print(i + " ");
        }


        System.out.println();
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(0);
        treeSet.add(5);
        for (Integer i : treeSet) {
            System.out.print(i + " ");
        }


    }
}
