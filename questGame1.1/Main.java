package com.company;

public class Main {

    public static void main(String[] args) {

        int answer = 0;
        DataBase dB = new DataBase();

        Quest[] quests = new Quest[]{
                new Quest(dB.m1),
                new Quest(dB.m21), new Quest(dB.m22), new Quest(dB.m23),
                new Quest(dB.m31), new Quest(dB.m32), new Quest(dB.m33), // количество будет зависить от длины квеста
        };

        for (int i = 0; i < quests.length; i += answer) { // переменной answer будет регулироваться квестовое ветвление
            answer = quests[i].question();
        }

        String result = (answer < 5) ? "Winner!!!!" : "Swinger!!!"; //условие будет зависить от квеста
        System.out.println(result);
    }
}

