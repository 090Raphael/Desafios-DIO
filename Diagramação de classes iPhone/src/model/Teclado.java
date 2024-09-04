package src.model;
import java.util.Scanner;

// Classe Keyboard (Teclado) - Gerencia toda entrada de dados
public class Teclado {
    private static Scanner scanner = new Scanner(System.in);

    public static String digitar(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
