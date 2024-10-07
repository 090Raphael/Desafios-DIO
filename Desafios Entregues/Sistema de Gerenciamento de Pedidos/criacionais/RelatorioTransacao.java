
package criacionais;

public class RelatorioTransacao {
    private static RelatorioTransacao instancia;

    private RelatorioTransacao() {}

    public static synchronized RelatorioTransacao getInstancia() {
        if (instancia == null) {
            instancia = new RelatorioTransacao();
        }
        return instancia;
    }

    public void registrarTransacao(String transacao) {
        System.out.println("Registrando transação: " + transacao);
    }
}
