package course.designpatterns.observer;

public class ObserverClient {
    public static void main(String[] args) {
        Observer observer = new ConsoleObserver();
        GeologicalService subject = new GeologicalService();

        subject.subscribe(observer);

        subject.tremble();

        subject.unsubscribe(observer);

        subject.tremble();
    }
}
