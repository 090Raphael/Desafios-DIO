import java.util.Scanner;
public interface ReprodutorMusical {
    public void tocar() {
        System.out.println("Música tocando...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }  
}

