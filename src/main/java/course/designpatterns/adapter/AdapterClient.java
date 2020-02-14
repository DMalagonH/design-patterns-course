package course.designpatterns.adapter;

public class AdapterClient {

    private EmailSender sender;

    public AdapterClient(EmailSender sender) {
        this.sender = sender;
    }

    public void execute() {
        String from = "diegomalagonh@gmail.com";
        String to = "dmalagonh91@gmail.com";
        String subject = "Patrón adaptador";
        String body = "Ejemplo de patrón adaptador";

        sender.send(from, to, subject, body);
    }
}
