package com.company.HWs.HW16.task1;

import java.util.Collections;

public class Main {
    /**
     * Необходимо реализовать класс-обертку над массивом ArrayWrapper,
     * который может хранить массив любого типа данных. Индексация
     * элементов этим классов ведется от 1.
     * Определить один конструктор, в который передается массив любого типа.
     * Определить метод получения элемента по индексу (пример: get(2)) (счет
     * ведется от 1, а не от 0).
     * Определить метод замены элемента по определенному индексу (пример:
     * replace(1, “Test”)). Реализовать следующие ограничения:
     * Для String: заменить строку можно только на строку большей длины
     * Для Integer: заменить число можно только на большее по значению
     * Метод replace должен возвращать boolean значение успешности замены.
     * Реализовать класс-исключение throw new IncorrectArrayWrapperIndex
     * (unchecked), которое выбрасывается при выходе за границы.
     * Используйте Generics.
     * Пример см. Тесты.
     */
    public static void main(String[] args) {
        String[] arrayString = {"hi", "hello", "hey"};
        Integer[] arrayInteger = {1, 2, 3};
        ArrayWrapper<String> array1 = new ArrayWrapper<>(arrayString);
        ArrayWrapper<Integer> array2 = new ArrayWrapper<>(arrayInteger);

        System.out.println(array1.get(3));
        System.out.println(array2.get(1));

        System.out.println(array1.replace(1, "dhrtshr"));
        System.out.println(array1);
        System.out.println(array2.replace(1, 8));
        System.out.println(array2);

    }
}
