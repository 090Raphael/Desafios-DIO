package sistema;

import java.util.Scanner;
import sistema.iphone.Iphone;
public class SistemaOperacional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Iphone IPhone = new Iphone();
        int opcao = 0;

        String aplicativo = """
                \n---- Escolha o aplicativo ----
                1. Reprodutor musical
                2. Aparelho telefônico
                3. Navegador de internet
                4. Encerrar aparelho
                """;
        
        while(opcao != 4) {
            System.out.println(aplicativo);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuReprodutorMusical(IPhone, scanner);
                    break;
                case 2:
                    menuAparelhoTelefonico(IPhone, scanner);
                    break;
                case 3:
                    menuNavegadorNaInternet(IPhone, scanner);
                    break;
                case 4:
                    System.out.println("Encerrando o aparelho");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }

    private static void menuReprodutorMusical(Iphone IPhone, Scanner scanner) {
        int opcao = 0;

        String reprodutorMusical = """
                \nReprodutor Musical:
                1. Tocar música
                2. Pausar música
                3. Selecionar música
                4. Voltar ao menu principal
                """;

        while (opcao != 4) {
            System.out.println(reprodutorMusical);
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            if(opcao == 1) {
                IPhone.tocar();
            }else if(opcao == 2) {
                IPhone.pausar();
            }else if(opcao == 3) {
                System.out.print("Digite o nome da música: ");
                String musica = scanner.nextLine();
                IPhone.selecionarMusica(musica);
            } else if(opcao == 4) {
                System.out.println("Voltando ao menu principal");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void menuAparelhoTelefonico(Iphone IPhone, Scanner scanner) {
        int opcao = 0;

        String aparelhoTelefonico = """
                \nAparelho Telefônico:
                1. Ligar
                2. Atender
                3. Iniciar correio de voz
                4. Voltar ao menu principal
                """;

        while (opcao != 4) {
            System.out.println(aparelhoTelefonico);
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 1) {
                System.out.print("Digite o número para ligar: ");
                String numero = scanner.nextLine();
                IPhone.ligar(numero);
            }else if(opcao == 2) {
                IPhone.atender();
            }else if(opcao == 3) {
                IPhone.iniciarCorreioVoz();
            } else if(opcao == 4) {
                System.out.println("Voltando ao menu principal");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void menuNavegadorNaInternet(Iphone IPhone, Scanner scanner) {
        int opcao = 0;

        String navegadorInternet = """
            \nNavegador de Internet:
            1. Exibir página na internet
            2. Adicionar nova aba
            3. Atualizar página
            4. Voltar ao menu principal
            """;

        while (opcao != 4) {
            System.out.println(navegadorInternet);
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            if(opcao == 1) {
                System.out.print("Digite a URL: ");
                String url = scanner.nextLine();
                IPhone.exibirPagina(url);
            }else if(opcao == 2) {
                IPhone.adicionarNovaAba();
            }else if(opcao == 3) {
                IPhone.adicionarNovaAba();
            } else if(opcao == 4) {
                System.out.println("Voltando ao menu principal");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
