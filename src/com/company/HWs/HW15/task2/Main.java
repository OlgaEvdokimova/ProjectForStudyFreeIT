package com.company.HWs.HW15.task2;

import java.util.Arrays;

public class Main {
    /**
     * Написать обобщенный класс MinMax, который содержит методы для
     * нахождения минимального и максимального элемента массива.
     * Элементы в массиве могут быть разного типа (integer,double,long).
     * Массив является переменной класса. Массив должен передаваться в
     * класс через конструктор.
     */
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 10, 11, 5, 6};
        MinMax<Integer> minMaxI = new MinMax<Integer>(array);
        System.out.println(minMaxI.min());
        System.out.println(minMaxI.max());

        Double[] arrayD = {1.2, 2.2, 3.2, 4.2, 10.2, 11.2, 5.2, 6.2};
        MinMax<Double> minMaxD = new MinMax<Double>(arrayD);
        System.out.println(minMaxD.min());
        System.out.println(minMaxD.max());

    }

}
