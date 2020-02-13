package course.designpatterns.state;

import java.time.Duration;

public class StateClient {
    public static void main(String[] args) {
        MicrowaveOven context = new MicrowaveOven();

        Duration duration = Duration.ofMinutes(2);

        context.start(duration);
        context.openDoor();
        context.stop();
        context.openDoor();
    }
}
