package course.designpatterns.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Proxy (logging)
public class UserServiceLogger implements UserService {

    private UserService userService;
    private Logger logger;

    public UserServiceLogger(UserService service) {
        userService = service;
        logger = LoggerFactory.getLogger(UserServiceLogger.class);
    }

    @Override
    public boolean save(String username) {
        logger.info("Antes de guardar el usuario " + username);

        boolean result = userService.save(username);

        String message = result ? "Guadado: " + username : "No guardado: " + username;
        logger.info(message);

        return result;
    }
}
