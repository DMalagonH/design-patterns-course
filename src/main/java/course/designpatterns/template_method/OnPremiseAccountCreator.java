package course.designpatterns.template_method;

public class OnPremiseAccountCreator extends AccountCreator {
    @Override
    void sendVerificationEmail(String email) {
        System.out.println("Enviar correo con servidor smtp local");
    }

    @Override
    void savePicture(byte[] picture) {
        System.out.println("Guardando imagen en el servidor local");
    }
}
