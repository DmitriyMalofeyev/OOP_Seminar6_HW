package ru.seminar.oop;

import ru.seminar.oop.controller.Controller;
import ru.seminar.oop.data.Circle;
import ru.seminar.oop.data.Rectangle;
import ru.seminar.oop.data.Square;
import ru.seminar.oop.data.Triangle;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller() ;
        controller.addShape(new Circle(2.0));
        controller.addShape(new Circle(11.1));
        controller.addShape(new Circle(22.2));
        controller.addShape(new Rectangle(11.5, 20.0));
        controller.addShape(new Rectangle(0.5, 0.4));
        controller.addShape(new Triangle(8.0, 8.0, 8.0));
        controller.addShape(new Triangle(3.0, 4.0, 5.0));
        controller.addShape(new Square(6.7));
        controller.addShape(new Square(14.14));
        controller.showAllShapes();
        controller.getAllAreas();
        controller.getAllPerimeters();
    }

}