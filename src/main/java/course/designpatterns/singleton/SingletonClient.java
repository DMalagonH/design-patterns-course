package course.designpatterns.singleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2 ? "Solo hay una instancia" : "Son instancias diferentes");

        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();

        System.out.println(threadSafeSingleton1 == threadSafeSingleton2 ? "Solo hay una instancia thread-safe" : "Son instancias diferentes thread-safe");
    }
}
