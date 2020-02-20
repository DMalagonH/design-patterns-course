package course.designpatterns.composite;

// Client
public class Department {

    private Employee leader;

    public Department(Employee leader) {
        this.leader = leader;
    }

    public void printMembers() {
        leader.print();
    }
}
