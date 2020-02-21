package course.designpatterns.template_method;

public class TemplateMethodClient {
    public static void main(String[] args) {
        Account account = new Account("dmalagonh", "123456", "diegomalagonh@gmail.com");
        account.setPicture(new byte[] {0,1,0});

        AccountCreator onPremiseCreator = new OnPremiseAccountCreator();
        onPremiseCreator.excecute(account);

        System.out.println();

        AccountCreator cloudCreator = new CloudAccountCreator();
        cloudCreator.excecute(account);
    }
}
