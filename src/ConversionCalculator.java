public class ConversionCalculator {

    public static void main(String[] args) {

        calfeetAndToCentimeters(-4,5);
        double validation = calfeetAndToCentimeters(4,-5);
        System.out.println(validation);
    }
    public static double calfeetAndToCentimeters(double feet, double inches) {
        if (feet < 0 || inches <0 || inches > 12) {
            return -1;
        } else {
            System.out.println("The parameters are valids");
        }
        return -1;
    }
}
