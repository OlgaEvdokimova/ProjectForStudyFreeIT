package com.company.HWs.HW15.task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T min() {
        if (array.length > 0) {
            T min = array[0];
            for (T el : array) {
                if (el.compareTo(min) < 0) {
                    min = el;
                }
            }
            return min;
        } else throw new EmptyArrayException("EmptyArrayException");
    }

    public T max() {
        T max = array[0];
        for (T el : array) {
            if (el.compareTo(max) > 0) {
                max = el;
            }
        }
        return max;
    }


    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
