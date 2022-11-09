package lab10.library;

public class Library {
    private Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent tmp = rents[0];
        for (Rent element : rents) {
            if (tmp.getStudent().average < element.getStudent().average) {
                tmp = element;
            }
        }
        return tmp;
    }
}
