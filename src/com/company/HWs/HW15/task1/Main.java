package com.company.HWs.HW15.task1;

public class Main {
    /**
     * Создайте класс Кошка с параметрами цвет глаз, порода. Сделайте
     * его объекты immutable, но при этом добавьте возможность setters на
     * объектах этого класса (сделайте это по аналогии с работой методов
     * класса String).
     */
    public static void main(String[] args) {
        Cat cat1 = new Cat("blue", "pirs");
        cat1.setBreed("siam");
        cat1.setEyesColor("green");
        //просто запустить программу

    }
}
