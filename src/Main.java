public class Main {
    public static void main(String[] args) {

        // Observar a diferença de output entre chamar apenas o metodo ou criar uma variavel para armezanar o valor
        // retornado do metodo
        //  Dessa forma apenas os valores dos parametros sao mostrados
        calculateScore("Mamão", 40);

        //  Dessa forma tanto os valores dos parametros sao mostrados como o valor do retorno
        int playerScore =  calculateScore("Mamão", 40);
        System.out.println(playerScore);

        calculateScore(349);//  apenas o valor do score
        int finalScore = calculateScore(349);
        System.out.println("Final score: " + finalScore); // Valor inserido no parametro e o valor de retorno
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        // Esse output apenas imprime os valores dos parametros nao retorna o resultado da multiplicacao
        System.out.printf("%s scored %d total = ", playerName, score);
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.printf("scored %d\n", score);
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name no player score.");
        return 0;
    }
}