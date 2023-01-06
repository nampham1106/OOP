package factory.abstractfactory.excercise2.app;

import factory.abstractfactory.excercise2.factories.AbstractFactory;
import factory.abstractfactory.excercise2.factories.FactoryProducer;
import factory.abstractfactory.excercise2.shape.Shape;

public class Demo {
    public static void main(String[] args) {
        FactoryProducer abstractProducer = new FactoryProducer();

        AbstractFactory rectangleFactory = abstractProducer.getFactory("Rectangle");
        Shape rectangleFormal = rectangleFactory.getShape("Rectangle");
        Shape roundedRectangle = rectangleFactory.getShape("Rounded Rectangle");

        AbstractFactory squareFactory = abstractProducer.getFactory("Square");
        Shape squareFormal = squareFactory.getShape("Square");
        Shape roundedSquare = squareFactory.getShape("Rounded Square");


        squareFormal.draw();
        rectangleFormal.draw();

        roundedRectangle.draw();
        roundedSquare.draw();
    }
}
