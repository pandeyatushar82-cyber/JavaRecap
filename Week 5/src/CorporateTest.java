//Tushar Pandeya 116242
public class CorporateTest {

    public static void main(String[] args) {

        // Before creating any employees
        System.out.println("Employee Count before creating: " + Employee.getEmployeeCount());

        // Creating employee objects
        Employee emp1 = new Employee("John", "Smith", Department.HR);
        Employee emp2 = new Employee("Sarah", "Johnson", Department.IT);
        Employee emp3 = new Employee("Michael", "Brown", Department.SALES);

        // After creating employees
        System.out.println("Employee Count after creating: " + Employee.getEmployeeCount());
    }
}