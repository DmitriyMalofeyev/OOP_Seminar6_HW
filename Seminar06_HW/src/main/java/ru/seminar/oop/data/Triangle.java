package ru.seminar.oop.data;

public class Triangle extends Polygon {
    double first;
    double second;
    double third;

    public Triangle(double first, double second, double third){
        this.first=first;
        this.second=second;
        this.third=third;
    }

    @Override
    public double perimeter() {
        return this.first+this.second+this.third;
    }

    @Override
    public double getArea() {
        double p = (this.first + this.second + this.third) / 2;
        return Math.sqrt(p * (p - first) * (p - second) * (p - third));
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public double getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "Треугольник{" +
                "сторона 1 =" + first +
                ", сторона 2 =" + second +
                ", сторона 3 =" + third +
                ", площадь =" + getArea() +
                ", периметр =" + perimeter() +
                '}';
    }
}
