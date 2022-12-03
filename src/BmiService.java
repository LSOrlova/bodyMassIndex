public class BmiService {
    public double calculate(double mass, double growth) {

        double bodyMassIndex = mass / growth / growth;
        return bodyMassIndex;
    }
}
