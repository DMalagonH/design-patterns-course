package course.designpatterns.decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        SalesReportGenerator csvGenerator = new CSVReportGenerator();
        SalesReportGenerator obfuscatorGenerator = new ObfuscatorReportGenerator(csvGenerator);

        DecoratorClient client = new DecoratorClient();
        client.execute(csvGenerator);
        client.execute(obfuscatorGenerator);
    }
}
