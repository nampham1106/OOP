package factory.abstractfactory.excercise2.factories;

import factory.abstractfactory.excercise2.shape.Shape;

public interface AbstractFactory {
    public abstract Shape getShape(String type);
}
