package queda;
import java.util.Scanner;

public class Queda {
    // Função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        for (String velocidade : velocidades) {
            try {
                int valor = Integer.parseInt(velocidade.trim());
                if (valor == 0) {
                    return "Queda de Conexao";
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: um ou mais valores de entrada não são válidos.");
                return "Erro na entrada";
            }
        }
        return "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as velocidades de conexão separadas por vírgula:");
        String input = scanner.nextLine();
        String[] velocidades = input.split(",");
        String resultado = verificarQuedaConexao(velocidades);
        System.out.println(resultado);
        scanner.close();
    }
}
