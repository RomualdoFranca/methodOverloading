public class Main {
    public static void main(String[] args) {

        // Observar a diferença de output entre chamar apenas o metodo ou criar uma variavel para armezanar o valor
        // retornado do metodo
        calculateScore("Mamão", 40);

        // Essa variavel armazena o valor do retorno (score * 1000)
        int playerScore =  calculateScore("Mamão", 40);
        System.out.println(playerScore);
    }
    public static int calculateScore(String playerName, int score) {
        // Esse output apenas imprime os valores dos parametros nao retorna o resultado da multiplicacao
        System.out.printf("%s scored %d\n", playerName, score);
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.printf(" scored %d\n", score);
        return score * 1000;
    }
}