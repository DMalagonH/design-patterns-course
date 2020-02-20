package course.designpatterns.composite;

// Component
public abstract class Employee {

    private String name;
    private String positionName;
    private String currentProject;

    public Employee(String name, String positionName) {
        this.name = name;
        this.positionName = positionName;
    }

    abstract void print();

    abstract void assignProject(String projectName);

    abstract void add(Employee employee);

    abstract void remove(Employee employee);

    abstract Employee getEmployee(int index);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }
}
