package ru.seminar.oop.service;

import ru.seminar.oop.data.Shape;

public interface IRepository <T extends Shape> {
    public void add(T value);
}
