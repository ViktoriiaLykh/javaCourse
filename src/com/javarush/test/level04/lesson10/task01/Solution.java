package com.javarush.test.level04.lesson10.task01;

/* 10 чисел
Вывести на экран числа от 1 до 10 используя цикл while.
*/

import java.io.IOException;

class Solution {
    public static void main(String[] args) throws IOException {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }


}