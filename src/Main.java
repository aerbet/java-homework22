import Task1.Employee;
import Task1.EmployeeConsole;

public class Main {

    public static void main(String[] args) {

        Employee employee = new EmployeeConsole().runEmployee();
        System.out.println(employee.printTotalInfo());



    }
}
