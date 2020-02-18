package course.designpatterns.decorator;

import java.util.List;

public interface SalesReportGenerator {

    String generate(List<ReportItem> items);

}
