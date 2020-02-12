package course.designpatterns.proxy;

public class ProxyClient {
    private UserService userService;

    public ProxyClient(UserService service) {
        userService = service;
    }

    public void saveUser(String username) {
        // logica de negocio...
        userService.save(username);
        // Más lógica de negocioo...
    }

}
