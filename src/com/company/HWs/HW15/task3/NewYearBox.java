package com.company.HWs.HW15.task3;

import java.util.List;

public class NewYearBox<T, P, V> {
    private List<T> gifts;
    private P boxCoast;
    private V owner;

    public NewYearBox(List<T> gifts, P boxCoast, V owner) {
        this.gifts = gifts;
        this.boxCoast = boxCoast;
        this.owner = owner;
    }

    public List<T> getGifts() {
        return gifts;
    }

    public void setGifts(List<T> gifts) {
        this.gifts = gifts;
    }

    public P getBoxCoast() {
        return boxCoast;
    }

    public void setBoxCoast(P boxCoast) {
        this.boxCoast = boxCoast;
    }

    public V getOwner() {
        return owner;
    }

    public void setOwner(V owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "NewYearBox for " +
                owner +
                "gifts=" + gifts +
                ", boxCoast=" + boxCoast
                ;
    }
}
