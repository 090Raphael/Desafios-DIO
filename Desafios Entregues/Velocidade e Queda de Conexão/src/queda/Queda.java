package queda;
import java.util.Scanner;

public class Queda {
    // Função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        // Iterar sobre cada velocidade no array
        for (String velocidade : velocidades) {
            try {
                // Converter a velocidade para um número inteiro
                int valor = Integer.parseInt(velocidade.trim());

                // Verificar se o valor é igual a 0
                if (valor == 0) {
                    return "Queda de Conexao";
                }
            } catch (NumberFormatException e) {
                // Caso haja um valor inválido, o sistema deve lidar com isso
                System.out.println("Erro: um ou mais valores de entrada não são válidos.");
                return "Erro na entrada";
            }
        }
        // Se nenhum valor for 0, retornar "Sem Quedas"
        return "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        System.out.println("Digite as velocidades de conexão separadas por vírgula:");
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}
