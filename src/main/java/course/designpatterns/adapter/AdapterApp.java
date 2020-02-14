package course.designpatterns.adapter;

public class AdapterApp {
    public static void main(String[] args) {
        // EmailSender sender = new SparkPostAdapter();
        EmailSender sender = new SendGridAdapter();
        AdapterClient client = new AdapterClient(sender);

        client.execute();

    }
}
