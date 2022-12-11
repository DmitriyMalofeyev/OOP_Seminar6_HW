package ru.seminar.oop.service;

import ru.seminar.oop.data.Perimeter;
import ru.seminar.oop.data.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeRepository implements IRepository{

    private final List<Shape> shapeList;

    public ShapeRepository() {
        this.shapeList = new ArrayList<Shape>();
    }

    public Double allPerimeters(){
        Double total= 0.0;
        for (Shape shape: shapeList){
            if (shape instanceof Perimeter){
                total =total + ((Perimeter)shape).perimeter();

            }
        }
        return total;
    }

    public Double allAreas(){

        List <Double> result = shapeList.stream()
                .map(Shape::getArea)
                .collect(Collectors.toList());
        return (double) result.stream().mapToInt(Double::intValue).sum();

    }

    @Override
    public void add(Shape value) {
        this.shapeList.add(value);

    }

    public List<Shape> getShapeList() {
        return shapeList;

    }
}
