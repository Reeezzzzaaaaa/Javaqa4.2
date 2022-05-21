public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int myCalculate = (int) service.calculate(70, 1.85);
        System.out.println(myCalculate);
    }
}