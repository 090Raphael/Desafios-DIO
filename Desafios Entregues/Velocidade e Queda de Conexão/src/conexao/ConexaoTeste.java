package conexao;
import java.util.Scanner;

public class ConexaoTeste {
    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        double total = 0;

        // Somar todas as velocidades registradas
        for (String velocidade : velocidades) {
            try {
                // Converter a velocidade para um número de ponto flutuante
                double valor = Double.parseDouble(velocidade.trim());
                total += valor;
            } catch (NumberFormatException e) {
                // Caso haja um valor inválido, o sistema deve lidar com isso
                System.out.println("Erro: um ou mais valores de entrada não são válidos.");
                return 0;
            }
        }

        // Calcular a média
        if (velocidades.length > 0) {
            return total / velocidades.length;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        System.out.println("Digite as velocidades de conexão separadas por vírgula:");

        String input = scanner.nextLine();

        // Exibindo a entrada fornecida para debug
        System.out.println("Entrada fornecida: " + input);

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão arredondada para o inteiro mais próximo
        System.out.println((int) Math.round(velocidadeMedia) + " Mbps");

        scanner.close();
    }
}
