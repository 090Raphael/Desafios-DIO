
public class Teclado {
    private Scanner scanner;

    public Keyboard() {
        scanner = new Scanner(System.in);
    }

    public String digitar() {
        System.out.print("Digite o texto: ");
        return scanner.nextLine();
    }
}
