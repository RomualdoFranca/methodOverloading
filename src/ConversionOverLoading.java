public class ConversionOverLoading {
    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters feet is the first parameter, inches is the 2nd parameter
    // You should validate that the first parameter feet is >= 0
    // You should validate that the 2nd parameter inches is >=0 and <=12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimetres
    // comprise the feet and inches passed to this method and return
    // that value.
    //
    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that its >=0
    // return -1 if it is not true
    // But if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly.
    // hints: Use double for your number datatypes is probably a good idea
    // 1 inch = 2.54cm  and one foot = 12 inches
    // use the link I give you to confirm your code is calculating correctly.
    // Calling another overloaded method just requires you to use the
    // right number of parameters.

    public static void main(String[] args) {

        // Tests validation of the first method
//        calFeetAndInchesToCetimeters(1, 12);
//        double centimeters = calFeetAndInchesToCetimeters(1, 12);
//        System.out.println(centimeters);
//        calFeetAndInchesToCetimeters(1, 12);
        // Tests validation of the second method
        calFeetAndInchesToCetimeters(-157);
    }
    // Create a method called calcFeetAndInchesToCentimeters
    public static double calFeetAndInchesToCetimeters(double feet, double inches) {

        if (feet < 0 || inches < 0 || inches > 12) { // Validation
            System.out.println("Feet value or inches values is  invalid.");
            return -1;
        }
        double centimeters = (feet * 30.48) + (inches * 2.54);
        System.out.printf("%.1fft %.1fin = %.2fcm\n", feet, inches, centimeters );
        return centimeters;
    }
    public static double calFeetAndInchesToCetimeters(double inches) {

        if (inches < 0 ) {
            System.out.println("Invalid input!!");
            return -1;
        }
        // Com a variavel double, o resultado da divisao nao é um numero inteiro, por isso fiz essa gambiarra, pois
        // nao sabia como converter
//        double feet = (inches - (inches % 12)) / 12;
        double feet = (int)inches / 12;
        double remainderInches = (int) inches % 12;
        System.out.printf("%.1fin = %.1fft and %.1fin\n", inches, feet, remainderInches);
//        System.out.printf("Feet = %.1f \n", feet);
//        inches = inches % 12;
//        System.out.println("Inches = " + inches);
        // Chama o primeiro metodo, mas com os 2 parametros do metodo overloading
        return calFeetAndInchesToCetimeters(feet, remainderInches);
    }

}
