package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(20));

        }
        System.out.println(integers);
        System.out.println();
        integers.stream().filter(x -> x % 2 == 0).map(x->x*x).max(Integer::compare).ifPresent(System.out::println);
    }

}
