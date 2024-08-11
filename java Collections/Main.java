import java.util.ArrayList;
 class Employee {
    private int empId;
    private String empName;
    private String email;
    private String gender;
    private float salary;

    // Constructor
    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Method to print employee details
    public void GetEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
    }
}


 class EmployeeDB {
    private ArrayList<Employee> list;

    // Constructor
    public EmployeeDB() {
        list = new ArrayList<>();
    }

    // Method to add an employee
    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    // Method to delete an employee by empId
    public boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.getEmpId() == empId) {
                return list.remove(e);
            }
        }
        return false;
    }

    // Method to show the payslip of an employee
    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.getEmpId() == empId) {
                return "Payslip for employee ID " + empId + ": " + e.getSalary();
            }
        }
        return "Employee not found.";
    }

    // Method to print all employees
    public void printAllEmployees() {
        for (Employee e : list) {
            e.GetEmployeeDetails();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        EmployeeDB employeeDB = new EmployeeDB();

        // Adding employees
        Employee emp1 = new Employee(1, "Alice", "alice@example.com", "Female", 50000);
        Employee emp2 = new Employee(2, "Bob", "bob@example.com", "Male", 60000);
        employeeDB.addEmployee(emp1);
        employeeDB.addEmployee(emp2);

        // Printing all employees
        System.out.println("All Employees:");
        employeeDB.printAllEmployees();

        // Showing payslip
        System.out.println(employeeDB.showPaySlip(1));

        // Deleting an employee
        System.out.println("Deleting Employee with ID 1: " + employeeDB.deleteEmployee(1));

        // Printing all employees after deletion
        System.out.println("All Employees after deletion:");
        employeeDB.printAllEmployees();
    }
}

