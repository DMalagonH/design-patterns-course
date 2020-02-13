package course.designpatterns.state;

import java.time.Duration;

public class MicrowaveOven {

    private State currentState;

    public MicrowaveOven() {
        currentState = new NotHeatingState(this);
    }

    public boolean start(Duration duration) {
        System.out.println("Estado actual: " + currentState.getClass().getSimpleName() + " - iniciar");
        boolean  result = currentState.start(duration);
        return result;
    }

    public boolean stop() {
        System.out.println("Estado actual: " + currentState.getClass().getSimpleName() + " - detener");
        return currentState.stop();
    }

    public boolean openDoor() {
        System.out.println("Estado actual: " + currentState.getClass().getSimpleName() + " - abrir puerta");
        return currentState.openDoor();
    }

    public void changeState(State newState) {
        currentState = newState;
    }
}
