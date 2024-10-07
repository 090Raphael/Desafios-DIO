
public class ReportService {
    private static ReportService instance;

    private ReportService() {}

    public static synchronized ReportService getInstance() {
        if (instance == null) {
            instance = new ReportService();
        }
        return instance;
    }

    public void generateReport(Order order) {
        System.out.println("Relatório gerado para: " + order.getDescription() + " - Preço: " + order.getPrice());
    }
}
