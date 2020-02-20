package course.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Manager extends Employee {

    private List<Employee> teamMembers;

    public Manager(String name, String positionName) {
        super(name, positionName);
        teamMembers = new ArrayList<>();
    }

    @Override
    void print() {
        String message = getName() + " - " + getPositionName() + " - " + getCurrentProject();
        System.out.println(message);

        for(Employee employee: teamMembers) {
            System.out.println("|-");
            employee.print();
        }
    }

    @Override
    void assignProject(String projectName) {
        for(Employee employee: teamMembers) {
            employee.assignProject(projectName);
        }

        this.setCurrentProject(projectName);
    }

    @Override
    void add(Employee employee) {
        teamMembers.add(employee);
    }

    @Override
    void remove(Employee employee) {
        teamMembers.remove(employee);
    }

    @Override
    Employee getEmployee(int index) {
        Employee result = teamMembers.get(index);
        return result;
    }
}
