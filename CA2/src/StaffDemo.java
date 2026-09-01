class Staff {

    String name;
    int staffId;

    Staff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Staff ID: " + staffId);
    }
}

class Manager extends Staff {

    int teamSize;

    Manager(String name, int staffId, int teamSize) {
        super(name, staffId);
        this.teamSize = teamSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}

public class StaffDemo {
    public static void main(String[] args) {

        Manager manager = new Manager("Ayush", 101, 8);

        manager.displayInfo();
    }
}