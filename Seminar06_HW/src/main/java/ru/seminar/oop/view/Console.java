package ru.seminar.oop.view;

import ru.seminar.oop.data.Shape;

import java.util.List;
import java.util.logging.Logger;

public class Console {

    private final Logger log = Logger.getAnonymousLogger();

    public void showAllShapes(List<Shape> shapeList) {
        shapeList.forEach(System.out::println);
    }

    public void showTotalArea(Double totalArea) {
        System.out.println("Общая площадь все фигур:" + totalArea);
    }

    public void showTotalPerimeter(Double totalPerimeter) {
        System.out.println("Общий периметр фигур:" + totalPerimeter);
    }
}
