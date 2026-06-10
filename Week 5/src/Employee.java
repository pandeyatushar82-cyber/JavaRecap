//Tushar Pandeya 116242
public class Employee {

    // Instance variables
    private String firstName;
    private String lastName;
    private Department dept;

    // Static variable shared by all objects
    private static int employeeCount = 0;

    // Constructor 1 (main constructor)
    public Employee(String firstName, String lastName, Department dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;

        employeeCount++;
    }

    // Constructor 2 (OVERLOADED constructor)
    // If department is not given, default is MANAGEMENT
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = Department.MANAGEMENT;

        employeeCount++;
    }

    // Static method to get employee count
    public static int getEmployeeCount() {
        return employeeCount;
    }
}