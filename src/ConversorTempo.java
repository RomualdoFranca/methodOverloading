public class ConversorTempo {
    public static void main(String[] args) {

        // Validation teste
//        getDurationString(81, 10);
//        int validation =  getDurationString(81, 10);
//        System.out.println(validation); // Retorna o valor do metodo
//        getDurationString(51, 30); // Retorna o output da condicao que for verdadeira
//        getDurationString(3710);
        int validation = getDurationString(3710); // Validation 1° overloading method
        System.out.println(validation);

    }
    public  static int getDurationString(int minute, int seconds) {

        if (minute < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value!");
            return -1;
        } else if (minute < 60) {
            System.out.printf("Resultado do else if : 00h:%dm:%ds\n", minute, seconds);

        } else {
            System.out.printf("%d minuto e %d segundo = ", minute, seconds);
            int hora = minute / 60;
            minute = minute % 60;
            System.out.printf(" %dh:%dm:%ds\n", hora, minute, seconds);
            return hora;
        }
        return 0;
    }
    public  static int getDurationString(int seconds){
        if (seconds < 0 ) {
            System.out.println("Invalid value!");
            return -1;
        }else {
            int minutes = seconds / 60;
            seconds -= minutes * 60;
            return getDurationString(minutes, seconds);
        }
    }
}
