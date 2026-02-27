import java.util.*;

interface EmpOperations {
    void addEmpRecord();
    void showEmpRecord();
}

class Employee implements EmpOperations {

    int empId;
    String empName;
    double empSalary;
    String department;

    Employee(int empId, String empName, double empSalary, String department) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.department = department;
    }

    public void addEmpRecord() {
        System.out.println("Employee record added for: " + empName);
    }

    public void showEmpRecord() {
        System.out.println("\nEmployee Information");
        System.out.println("ID        : " + empId);
        System.out.println("Name      : " + empName);
        System.out.println("Department: " + department);
        System.out.println("Salary    : " + empSalary);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter total number of employees: ");
        int count = s.nextInt();
        s.nextLine();

        Employee[] empList = new Employee[count];   // simple array

        for(int i = 0; i < count; i++) {

            System.out.println("\nEnter Employee " + (i+1) + " Details");

            System.out.print("Employee ID: ");
            int id = s.nextInt();
            s.nextLine();

            System.out.print("Employee Name: ");
            String name = s.nextLine();

            System.out.print("Department: ");
            String dept = s.nextLine();

            System.out.print("Salary: ");
            double salary = s.nextDouble();
            s.nextLine();

            empList[i] = new Employee(id, name, salary, dept);
            empList[i].addEmpRecord();
        }

        System.out.println("\nAll Employee Details");

        for(int i = 0; i < count; i++) {
            empList[i].showEmpRecord();
        }

        s.close();
    }
}


