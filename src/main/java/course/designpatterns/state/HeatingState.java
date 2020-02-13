package course.designpatterns.state;

import java.time.Duration;

public class HeatingState implements State {

    private MicrowaveOven context;

    public HeatingState(MicrowaveOven oven) {
        context = oven;
    }

    @Override
    public boolean start(Duration duration) {
        return false;
    }

    @Override
    public boolean stop() {
        context.changeState(new NotHeatingState(context));
        return true;
    }

    @Override
    public boolean openDoor() {
        return false;
    }
}
