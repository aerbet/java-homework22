import Task1.Employee;
import Task1.EmployeeConsole;
import Task2.figure.FigureConsole;

public class Main {

    public static void main(String[] args) {

        Employee employee = new EmployeeConsole().runEmployee();
        System.out.println(employee.printTotalInfo());

        FigureConsole figure = new FigureConsole();
        figure.runCalculation();


    }
}
