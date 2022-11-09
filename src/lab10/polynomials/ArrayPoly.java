package lab10.polynomials;

public class ArrayPoly extends AbstractPoly{
    private final double[] coeficients;

    public ArrayPoly(double[] coeficients) {
        this.coeficients = coeficients;
    }
    @Override
    public double[] coeficients() {
        return new double[0];
    }

    @Override
    public double coeficient(int i) {
        return coeficients[i];
    }

    @Override
    public int degree() {
        return coeficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] degreeDiff = new double[degree() - 1];
        for (int i = 0; i < degreeDiff.length; i++) {
            if (coeficients()[i + 1] == 0) {
                degreeDiff[i] = 0;
            } else {
                degreeDiff[i] = coeficients[i+1] * (i+1);
            }
        }

        Poly diff = new ArrayPoly(degreeDiff);

        return diff;
    }
}
