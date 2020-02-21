package course.designpatterns.template_method;

public class CloudAccountCreator extends AccountCreator {
    @Override
    void sendVerificationEmail(String email) {
        System.out.println("Enviar correo a través de servicio masivo");
    }

    @Override
    void savePicture(byte[] picture) {
        System.out.println("Guardando imagen en servicio de storage");
    }

    @Override
    void log(Account account) {
        System.out.println("Guardando log de la creación");
    }
}
