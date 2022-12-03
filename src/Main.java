public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 48; // масса тела вводится в килограммах
        double growth = 1.6; // рост вводится в метрах!!!
        double BmiService = service.calculate(mass, growth);


        System.out.println("Your body mass index is " + BmiService);
    }
}