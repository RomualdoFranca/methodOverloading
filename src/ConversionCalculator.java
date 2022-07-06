public class ConversionCalculator {
// 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
    public static void main(String[] args) {

//        calfeetAndToCentimeters(10, 10);
//        double validation = calfeetAndToCentimeters(10, 10);
//        System.out.printf("%.2f\n", validation);

        double overLoading1 = calfeetAndToCentimeters(12);
//        System.out.printf("Transformed inches in centimeters: %.2fcm\n ", overLoading1);

        double inches = overLoading1 / 2.54;
//        inches /= 2.54;
//        System.out.printf("Transformed centimeters in inches: %.2fin\n ", inches);

        double feets = overLoading1 / 30.48;
//        feets /= 12;
//        System.out.printf("Transformed centimeters in feets: %.2fft\n ", feets);

        double reverseConversion =  calfeetAndToCentimeters(feets, inches);
        System.out.printf("%.2f", reverseConversion);
    }
// test for validation to check if calculation are correct
    //checking parameters
    public static double calfeetAndToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        System.out.printf("%.2f feet and %.2f inches \n", feet, inches);
        inches *= 2.54;
        feet = inches * 12;
        return inches + feet;
    }

    public static double calfeetAndToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }
        calfeetAndToCentimeters(1, 12);
    }
}
