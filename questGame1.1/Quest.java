package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Quest {

    private HashMap<Integer, String> map;

    public Quest(HashMap<Integer, String> map) {
        this.map = map;
    }

    int question() {
        int choice;

        do {
            System.out.println(map.get(0));
            System.out.println("1 " + map.get(1));
            System.out.println("2 " + map.get(2));
            System.out.println("3 " + map.get(3));
            System.out.println("Выберите нужный вариант");
            choice = new Scanner(System.in).nextInt();
        } while (choice < 1 || choice > 3);

        System.out.println();

        switch (choice) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
        }
        return 0;
    }
}
