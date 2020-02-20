package course.designpatterns.composite;

public class CompositeApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Diego", "Senior Manager");
        Manager anotherManager = new Manager("Alejandro", "Mid manager");

        anotherManager.add(new Engineer("Juanita", "Senior software engineer"));
        anotherManager.add(new Engineer("Pepita", "Junior software engineer"));

        manager.add(anotherManager);

        manager.assignProject("Migrar app a la nube");

        Department department = new Department(manager);
        department.printMembers();
    }
}
