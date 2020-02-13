package course.designpatterns.state;

import java.time.Duration;

public interface State {
    boolean start(Duration duration);
    boolean stop();
    boolean openDoor();
}
