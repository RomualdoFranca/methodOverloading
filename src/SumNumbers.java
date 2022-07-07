public class SumNumbers {
    public static void main(String[] args) {

    }
    //  É possivel acrescentar ou diminuir paramentros nos overloading.
    //  Pode-se usar um parametro dentro do outro
    // Pode-se chamar um metodo similar, mas com diferentes tipos de dados
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static int sum(int num1, int num2, int num3) { // 1° Overloading
        return num1 + num2 + num3;
    }
    public static int sum(int num1, int num2, int num3, int num4) { // 2° Overloading
        return num1 + num2 + num3 + num4;
    }

}
