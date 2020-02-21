package course.designpatterns.template_method;

// Abstract class
public abstract class AccountCreator {

    // template method
    final void excecute(Account account) {
        boolean accountSaved = saveAccountData(account);

        if (accountSaved) {
            sendVerificationEmail(account.getEmail());
            savePicture(account.getPicture());
            log(account);
        }
    }

    abstract void sendVerificationEmail(String email);

    abstract void savePicture(byte[] picture);

    // hook
    void log(Account account) {

    }

    final boolean saveAccountData(Account account) {
        System.out.println("Guardar la cuenta");
        return true;
    }
}
