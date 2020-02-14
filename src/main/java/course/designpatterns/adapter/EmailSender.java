package course.designpatterns.adapter;

// Objetivo/Target
public interface EmailSender {
    void send(String from, String to, String subject, String body);
}
