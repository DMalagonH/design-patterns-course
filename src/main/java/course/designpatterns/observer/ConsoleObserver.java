package course.designpatterns.observer;

public class ConsoleObserver implements Observer {

    @Override
    public void update(Earthquake earthquake) {
        System.out.println("Movimiento sìsmico!");

        String location = String.format("Ubicación: (%.5f, %.5f)", earthquake.getLatitude(), earthquake.getLongitude());
        System.out.println(location);
        System.out.println("Magnitud :" + earthquake.getMagnitude());
        System.out.println("Fecha :" + earthquake.getDateTime());
    }
}
