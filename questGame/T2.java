package com.company.questGame;

import java.util.HashMap;
import java.util.Scanner;

class T2 extends T1 {
    int questLine;
    T3 t3;

    T2(int questLine) {
        this.questLine = questLine;
    }


    HashMap<Integer, String> m21 = new HashMap<>();
    HashMap<Integer, String> m22 = new HashMap<>();
    HashMap<Integer, String> m23 = new HashMap<>();


    HashMap<Integer, String> mapper(HashMap map) {

        m21.put(0, "1st Line m21 Quest description");
        m21.put(1, "1st question - 2nd LVL");
        m21.put(2, "2nd question - 2nd LVL");
        m21.put(3, "3rd question - 2nd LVL");

        m22.put(0, "2nd Line m22 Quest description");
        m22.put(1, "1st question - 2nd LVL");
        m22.put(2, "2nd question - 2nd LVL");
        m22.put(3, "3rd question - 2nd LVL");

        m23.put(0, "3rd Line m23 Quest description");
        m23.put(1, "1st question - 2nd LVL");
        m23.put(2, "2nd question - 2nd LVL");
        m23.put(3, "3rd question - 2nd LVL");
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

        t3 = new T3(questLine + choice);
        System.out.println("T2 questLine :" + questLine);
        System.out.println();

        switch (choice) {
            case 1:
                switch (questLine) {
                    case 1:
                        t3.question(t3.mapper(t3.m31));
                        break;
                    case 2:
                        t3.question(t3.mapper(t3.m32));
                        break;
                    case 3:
                        t3.question(t3.mapper(t3.m33));
                        break;
                }
                break;
            case 2:
                switch (questLine) {
                    case 1:
                        t3.question(t3.mapper(t3.m34));
                        break;
                    case 2:
                        t3.question(t3.mapper(t3.m35));
                        break;
                    case 3:
                        t3.question(t3.mapper(t3.m36));
                        break;
                }
                break;
            case 3:
                switch (questLine) {
                    case 1:
                        t3.question(t3.mapper(t3.m37));
                        break;
                    case 2:
                        t3.question(t3.mapper(t3.m38));
                        break;
                    case 3:
                        t3.question(t3.mapper(t3.m39));
                        break;
                }
                break;
        }
    }
}
