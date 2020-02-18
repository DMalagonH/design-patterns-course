package course.designpatterns.decorator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DecoratorClient {

    public void execute(SalesReportGenerator generator) {
        List<ReportItem> items = new ArrayList<>();

        LocalDate now = LocalDate.now();
        items.add(new ReportItem(100, "Diego Malagón", now.minusDays(1), 100));
        items.add(new ReportItem(101, "Juan Lopez", now.minusDays(2), 200));
        items.add(new ReportItem(102, "Pedro Perez", now.minusDays(3), 300));

        String filePath = generator.generate(items);
        System.out.println(filePath);
    }
}

