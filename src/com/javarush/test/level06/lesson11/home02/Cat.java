package com.javarush.test.level06.lesson11.home02;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

import java.util.ArrayList;

class Cat {

    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
        cats.add(this);
    }

    private static void printCats() {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Cat();
        }
        printCats();
    }
}