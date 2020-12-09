package com.company.HWs.HW15.task1;

import java.util.Objects;

public class Cat {
    private String eyesColor;
    private String breed;

    public Cat(String eyesColor, String breed) {
        this.eyesColor = eyesColor;
        this.breed = breed;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(eyesColor, cat.eyesColor) &&
                Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eyesColor, breed);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "eyesColor='" + eyesColor + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
