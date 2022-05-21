public class BmiService {

    public double calculate(double m, double h) {
        double results;
        results = m / (h * h);

        /* m - масса тела
           h - рост
         */

        return results;
    }
}
