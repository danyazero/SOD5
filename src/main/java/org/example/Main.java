package org.example;

import BLL.MyHashTable;

import java.util.HashSet;
import java.util.Random;

public class Main {
    public static final int num = 100_000;
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private static void run() {
        MyHashTable<Integer> table = new MyHashTable();

        Random random = new Random();

        fillHash(random, table);

        HashSet<Integer> hash = new HashSet<Integer>();

        fillHash(random, hash);

    }

    private static <T extends MyHashTable> void fillHash(Random random, T hash) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= num; i++) {
            hash.add(random.nextInt(1, num));
        }
        long finish = System.currentTimeMillis();
        System.out.println("MyHashTable Time = " + (finish-start));
    }

    private static <T extends HashSet> void fillHash(Random random, T hash) {

        long start = System.currentTimeMillis();
        for (int i = 0; i <= num; i++) {
            hash.add(random.nextInt(1, num));
        }
        long finish = System.currentTimeMillis();
        System.out.println("HashSet Time = " + (finish-start));
    }
}