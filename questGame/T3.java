package com.company.questGame;

import java.util.HashMap;
import java.util.Scanner;

class T3 extends T1 {
    int questLine;
//    T4 t4;

    T3(int questLine) {
        this.questLine = questLine;
    }

    HashMap<Integer, String> m31 = new HashMap<>();
    HashMap<Integer, String> m32 = new HashMap<>();
    HashMap<Integer, String> m33 = new HashMap<>();
    HashMap<Integer, String> m34 = new HashMap<>();
    HashMap<Integer, String> m35 = new HashMap<>();
    HashMap<Integer, String> m36 = new HashMap<>();
    HashMap<Integer, String> m37 = new HashMap<>();
    HashMap<Integer, String> m38 = new HashMap<>();
    HashMap<Integer, String> m39 = new HashMap<>();


    HashMap<Integer, String> mapper(HashMap map) {

        m31.put(0, "1st Line m31 Quest description");
        m31.put(1, "1st question - 3rd LVL");
        m31.put(2, "2nd question - 3rd LVL");
        m31.put(3, "3nd question - 3rd LVL");

        m32.put(0, "1st Line m32 Quest description");
        m32.put(1, "1st question - 3rd LVL");
        m32.put(2, "2nd question - 3rd LVL");
        m32.put(3, "3nd question - 3rd LVL");

        m33.put(0, "1st Line m33 Quest description");
        m33.put(1, "1st question - 3rd LVL");
        m33.put(2, "2nd question - 3rd LVL");
        m33.put(3, "3nd question - 3rd LVL");

        m34.put(0, "2nd Line m34 Quest description");
        m34.put(1, "1st question - 3rd LVL");
        m34.put(2, "2nd question - 3rd LVL");
        m34.put(3, "3nd question - 3rd LVL");

        m35.put(0, "2nd Line m35 Quest description");
        m35.put(1, "1st question - 3rd LVL");
        m35.put(2, "2nd question - 3rd LVL");
        m35.put(3, "3nd question - 3rd LVL");

        m36.put(0, "2nd Line m36 Quest description");
        m36.put(1, "1st question - 3rd LVL");
        m36.put(2, "2nd question - 3rd LVL");
        m36.put(3, "3nd question - 3rd LVL");

        m37.put(0, "3rd Line m37 Quest description");
        m37.put(1, "1st question - 2nd LVL");
        m37.put(2, "2nd question - 2nd LVL");
        m37.put(3, "3nd question - 2nd LVL");

        m38.put(0, "3rd Line m38 Quest description");
        m38.put(1, "1st question - 3rd LVL");
        m38.put(2, "2nd question - 3rd LVL");
        m38.put(3, "3nd question - 3rd LVL");

        m39.put(0, "3rd Line m39 Quest description");
        m39.put(1, "1st question - 3rd LVL");
        m39.put(2, "2nd question - 3rd LVL");
        m39.put(3, "3nd question - 3rd LVL");
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

//        t4 = new T4(questLine + choice);
        System.out.println("T3 questLine :" + questLine);
        System.out.println();

        switch (choice) {
            case 1:
                System.out.println("You are the Winner!!!");
//                t2.question(t2.mapper(t2.m21));
                break;
            case 2:
                System.out.println("You are The Really Winner!!!");
//                t2.question(t2.mapper(t2.m22));
                break;
            case 3:
                System.out.println("You are the Looser!!!");
//                t2.question(t2.mapper(t2.m23));
                break;
        }

    }
}
