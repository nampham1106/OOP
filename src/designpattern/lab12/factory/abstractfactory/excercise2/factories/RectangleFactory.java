package factory.abstractfactory.excercise2.factories;

import factory.abstractfactory.excercise2.shape.Shape;
import factory.abstractfactory.excercise2.shape.rectangle.RectangleFormal;
import factory.abstractfactory.excercise2.shape.rectangle.RoundedRectangle;

public class RectangleFactory implements AbstractFactory{
    @Override
    public Shape getShape(String type) {
        if (type.equals("Rectangle")) {
            return new RectangleFormal();
        } else if (type.equals("Rounded Rectangle")) {
            return new RoundedRectangle();
        } else {
            return null;
        }
    }

}
