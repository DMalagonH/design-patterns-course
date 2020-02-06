package course.designpatterns.facade;

public class FacadeClient {
    public static void main(String[] args) {
        FileManager manager = new FileManager();
        int count = manager.countCharacters("test.txt");
        System.out.println("Num characteres: " + count);
    }
}
