package course.designpatterns.composite;

// leaf
public class Engineer extends Employee {
    public Engineer(String name, String positionName) {
        super(name, positionName);
    }

    @Override
    void print() {
        String message = getName() + " - " + getPositionName() + " - " + getCurrentProject();
        System.out.println(message);
    }

    @Override
    void assignProject(String projectName) {
        this.setCurrentProject(projectName);
    }

    @Override
    void add(Employee employee) {
        throw new UnsupportedOperationException();
    }

    @Override
    void remove(Employee employee) {
        throw new UnsupportedOperationException();
    }

    @Override
    Employee getEmployee(int index) {
        throw new UnsupportedOperationException();
    }
}
