package conexao;
import java.util.Scanner;

public class ConexaoTeste {
    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        double total = 0;
        for (String velocidade : velocidades) {
            try {
                double valor = Double.parseDouble(velocidade.trim());
                total += valor;
            } catch (NumberFormatException e) {
                System.out.println("Erro: um ou mais valores de entrada não são válidos.");
                return 0;
            }
        }
        if (velocidades.length > 0) {
            return total / velocidades.length;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as velocidades de conexão separadas por vírgula:");
        String input = scanner.nextLine();
        String[] velocidades = input.split(",");
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);
        System.out.println((int) Math.round(velocidadeMedia) + " Mbps");
        scanner.close();
    }
}
