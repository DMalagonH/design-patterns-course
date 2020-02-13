package course.designpatterns.state;

import java.time.Duration;

public class NotHeatingState implements State {

    private MicrowaveOven context;

    public NotHeatingState(MicrowaveOven oven) {
        context = oven;
    }

    @Override
    public boolean start(Duration duration) {
        context.changeState(new HeatingState(context));
        return true;
    }

    @Override
    public boolean stop() {
        return false;
    }

    @Override
    public boolean openDoor() {
        return true;
    }
}
