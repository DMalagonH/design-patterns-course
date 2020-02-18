package course.designpatterns.decorator;

import java.io.*;
import java.util.List;
import java.util.UUID;

// Concrete component
public class CSVReportGenerator implements SalesReportGenerator {
    @Override
    public String generate(List<ReportItem> items) {
        File file = new File("reporte_" + UUID.randomUUID() + ".csv");

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("ID,Nombre cliente,Fecha,Valor");

            for(ReportItem item: items) {
                writer.printf("%s,%s,%s,%s", item.getSaleId(), item.getCustomerName(), item.getDate(), item.getAmount());
                writer.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file.getAbsolutePath();
    }
}
