package ru.seminar.oop.controller;

import ru.seminar.oop.data.Shape;
import ru.seminar.oop.service.ShapeRepository;
import ru.seminar.oop.view.Console;


public class Controller {

    private final Console console ;
    private final ShapeRepository repository;
    public Controller() {
        this.repository = new ShapeRepository();
        this.console = new Console();

    }

    public void showAllShapes(){
        console.showAllShapes(this.repository.getShapeList());
        console.showTotalArea(this.repository.allAreas());
    }

    public void addShape(Shape shape) {
        this.repository.add(shape);

    }

    public void getAllAreas(){
        this.repository.allAreas();
    }

    public void getAllPerimeters(){
        console.showTotalPerimeter(this.repository.allPerimeters());
    }
}
