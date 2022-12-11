package ru.seminar.oop.data;

public abstract class Polygon extends Shape implements Perimeter {

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
