package course.designpatterns.adapter;

import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;

public class SparkPostAdapter implements EmailSender {

    @Override
    public void send(String from, String to, String subject, String body) {
        Client client = new Client("API_KEY");

        try {
            client.sendMessage(from, to, subject, body, null);
            System.out.println("Mensaje enviado con SparkPost");
        } catch (SparkPostException e) {
            e.printStackTrace();
            System.out.println("No se pudo enviar mensaje con SparkPost");
        }

    }
}
