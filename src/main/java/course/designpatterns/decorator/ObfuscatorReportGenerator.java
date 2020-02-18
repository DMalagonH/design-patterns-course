package course.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Concrete decorator
public class ObfuscatorReportGenerator  extends ReportDecorator{

    private static final String[] firstNames = { "Oliver", "Beatriz", "James", "Aureliano", "Soraya", "Natasha" };
    private static final String[] lastNames = { "Atom", "Pinzón", "Bond", "Buendia", "Montenegro", "Romanoff" };
    private static Random random = new Random();

    public ObfuscatorReportGenerator(SalesReportGenerator generator) {
        super(generator);
    }

    @Override
    public String generate(List<ReportItem> items) {
        List<ReportItem> newList = new ArrayList<>();

        for (ReportItem item: items) {
            ReportItem newItem = new ReportItem(item.getSaleId(), obfuscateName(), item.getDate(), item.getAmount());
            newList.add(newItem);
        }

        SalesReportGenerator generator = getTargetGenerator();

        return generator.generate(newList);
    }

    private String obfuscateName() {
        String firstName = firstNames[random.nextInt(6)];
        String lastName = lastNames[random.nextInt(6)];
        return firstName + " " + lastName;
    }
}
