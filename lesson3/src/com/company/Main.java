package com.company;

import java.util.ArrayList;

public class Main {

//        1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
//        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//        Посчитать, сколько раз встречается каждое слово.
//        2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//        В этот телефонный справочник с помощью метода add() можно добавлять записи.
//        С помощью метода get() искать номер телефона по фамилии.
//        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//        тогда при запросе такой фамилии должны выводиться все телефоны.

    public static void main(String[] args) {
        String[] words = {"one", "two", "three"};
        String[][] wordsCount=wordsCounter(words);
        for (int i = 0; i < words.length ; i++) {
            System.out.println(howMachIs(words[i]));
        }

    }

    private static String[][] wordsCounter(String[] words) {
//        ArrayList<String>
        return new String[0][];
    }

    private static int howMachIs(String word) {

        return 0;
    }
}
