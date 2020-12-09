package com.company.HWs.HW15.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Напишите параметризованный класс NewYearBox, который содержит
     * List подарков типа Т, цену коробки – P и владельца V. Реализуйте для
     * класса геттеры, сеттеры и toString. Используйте класс в main с
     * разными типами параметров.
     */
    public static void main(String[] args) {
        Gift gift1 = new Gift("Doll");
        Gift gift2 = new Gift("Cup");
        Gift gift3 = new Gift("Towel");
        List<Gift> giftList = new ArrayList<Gift>(List.of(gift1,gift2,gift3));
        Daughter daughter = new Daughter("Liza", 10);
        Son son = new Son("bob", 4);
        NewYearBox<Gift, Double, Person> newYearBoxLiza = new NewYearBox<Gift, Double, Person>(giftList, 25.5, daughter);
        NewYearBox<Gift, Integer, Person> newYearBoxBob = new NewYearBox<Gift, Integer, Person>(giftList, 25, son);
        System.out.println(newYearBoxLiza);
        System.out.println(newYearBoxBob);
    }
}
