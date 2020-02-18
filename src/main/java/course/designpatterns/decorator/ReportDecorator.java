package course.designpatterns.decorator;

// Decorator
public abstract class ReportDecorator implements SalesReportGenerator{

    private SalesReportGenerator targetGenerator;

    public ReportDecorator(SalesReportGenerator generator) {
        targetGenerator = generator;
    }

    public SalesReportGenerator getTargetGenerator() {
        return targetGenerator;
    }
}
