package course.designpatterns.proxy;

public class ProxyApp {
    public static void main(String[] args) {
        UserService service = new BaseUserService(); // Sujeto real
        UserService proxy = new UserServiceLogger(service); // Proxy

        ProxyClient client = new ProxyClient(proxy);

        client.saveUser("dmalagonh");
    }
}
