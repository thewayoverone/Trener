package com.company.questGame;

import java.util.HashMap;
import java.util.Scanner;

class T1 {
    public int questLine;
    T2 t2;

    HashMap<Integer, String> m1 = new HashMap<>();

    HashMap<Integer, String> mapper(HashMap map) {

        m1.put(0, "Quest description");
        m1.put(1, "1st question - m1 1st LVL");
        m1.put(2, "2nd question - m1 1st LVL");
        m1.put(3, "3rd question - m1 1st LVL");
        return map;
    }


    void question(HashMap<Integer, String> m) {
        int choice;

        do {
            System.out.println(m.get(0));
            System.out.println("1 " + m.get(1));
            System.out.println("2 " + m.get(2));
            System.out.println("3 " + m.get(3));
            System.out.println("Выберите нужный вариант");
            choice = new Scanner(System.in).nextInt();
        } while (choice < 1 || choice > 3);

        System.out.println();

        t2 = new T2(questLine + choice);
        System.out.println("T1 questLine :" + questLine);
        System.out.println();

        switch (choice) {
            case 1:
                t2.question(t2.mapper(t2.m21));
                break;
            case 2:
                t2.question(t2.mapper(t2.m22));
                break;
            case 3:
                t2.question(t2.mapper(t2.m23));
                break;
        }
    }
}

