package visitor.execercise2;

public class Demo {
    public static void main(String[] args) {
        ComputerPart part = new Computer();
        part.accept(new ComputerPartDisplayVisitor());
    }
}
