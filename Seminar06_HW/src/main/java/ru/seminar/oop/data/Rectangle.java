package ru.seminar.oop.data;

public class Rectangle extends Polygon {
    double first;
    double second;

    public Rectangle(double first, double second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public double perimeter() {
        return (this.first+this.second)*2;
    }

    @Override
    public double getArea() {
        return this.first*this.second;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Прямоугольник{" +
                "сторона 1=" + first +
                ", сторона 2=" + second +
                ", площадь =" + getArea() +
                ", периметр =" + perimeter() +
                '}';
    }
}


