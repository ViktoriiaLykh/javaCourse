package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

class Solution {
    public static void main(String[] args) {
        int x = 1;

        for (int y = 1; y <= 10; y++) {
            x = x * y;
        }
        System.out.print(x);
    }
}