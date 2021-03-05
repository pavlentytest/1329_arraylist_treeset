package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Maria");
        names.add("Petr");
        names.add("Alex");
        names.add("Olga");
        names.add("Olga");

        TreeSet<String> names_set = new TreeSet<>(names);

        Iterator<String> iterator = names_set.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<String> names_set_desc = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        names_set_desc.addAll(names);

        Iterator<String> iterator2 = names_set_desc.iterator();

        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
