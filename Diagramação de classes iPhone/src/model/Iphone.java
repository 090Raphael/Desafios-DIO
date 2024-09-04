import java.util.Scanner;

public class iPhone {
    private MusicPlayer musicPlayer;
    private Phone phone;
    private WebBrowser webBrowser;
    private Keyboard keyboard;

    public iPhone() {
        this.musicPlayer = new MusicPlayer();
        this.phone = new Phone();
        this.webBrowser = new WebBrowser();
        this.keyboard = new Keyboard();
    }

    public void usarMusica() {
        System.out.println("Usando Reprodutor de Música...");
        String musica = keyboard.digitar();
        musicPlayer.selecionarMusica(musica);
        musicPlayer.tocar();
    }

    public void usarTelefone() {
        System.out.println("Usando Telefone...");
        String numero = keyboard.digitar();
        phone.ligar(numero);
    }

    public void usarNavegador() {
        System.out.println("Usando Navegador...");
        String url = keyboard.digitar();
        webBrowser.exibirPagina(url);
    }
}

// Classe principal para teste
public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Exemplo de uso
        meuIphone.usarMusica();
        meuIphone.usarTelefone();
        meuIphone.usarNavegador();
    }