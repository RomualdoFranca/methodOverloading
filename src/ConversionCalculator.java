public class ConversionCalculator {

    public static void main(String[] args) {

        calfeetAndToCentimeters(10, 10);
        double validation = calfeetAndToCentimeters(10,10);
        System.out.printf("%.2f", validation);
    }
    public static double calfeetAndToCentimeters(double feet, double inches) {
        if (feet < 0 || inches <0 || inches > 12) {
            return -1;
        }
        System.out.println(feet + " Feets " +  inches + " inches " );
        inches *= 2.54;
        feet = inches * 12;
        return inches + feet ;
    }
}
