package factory.abstractfactory.excercise2.factories;

import factory.abstractfactory.excercise2.shape.Shape;
import factory.abstractfactory.excercise2.shape.square.RoundedSquare;
import factory.abstractfactory.excercise2.shape.square.SquareFormal;

public class SquareFactory implements AbstractFactory{

    @Override
    public Shape getShape(String type) {
        if (type.equals("Square")) {
            return new SquareFormal();
        } else if (type.equals("Rounded Square")) {
            return new RoundedSquare();
        } else {
            return null;
        }
    }

}
