package Task1;

import Task1.exceptions.EmployeeYearException;
import Task1.exceptions.EmployeeNamesException;

import java.time.Year;
import java.util.Scanner;

public class Employee {
    protected String name;
    protected String lastName;
    protected int yearOfBirth;
    protected int workStartYear;

    public Employee() {

    }

    public String printTotalInfo() {
        int experience = Year.now().getValue() - this.workStartYear;

        return String.format("%nОбщий рабочий стаж сотрудника %s %s: %d %s%n",
                this.name,
                this.lastName,
                experience,
                ((experience < 5) ? "года" : "лет"));
    }

    protected int validateYears(String year) throws EmployeeYearException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите год %s сотрудника: ", year);
        int employee;

        if (sc.hasNextInt()) {
            employee = Math.abs(sc.nextInt());
        } else {
            sc.nextLine();
            throw new EmployeeYearException("Год рождения или начало года работы не может быть строкой");
        }

        if (employee > Year.now().getValue()) {
            throw new EmployeeYearException("Год рождения или начало года работы не может быть в будущем времени");
        }

        return employee;
    }

    protected String validateNames(String str) throws EmployeeNamesException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите %s сотрудника: ", str);
        String employee = sc.nextLine().trim();

        if (employee.isEmpty()) {
            throw new EmployeeNamesException("Имя или фамилия не может быть бустой");
        }

        for (char c : employee.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new EmployeeNamesException("Имя или фамилия человека не может содержать число");
            }
        }

        if (!employee.matches("[a-zA-Zа-яА-ЯёЁ]+")) {
            throw new EmployeeNamesException("Имя или фамилия человека может содержать только буквы");
        }

        return employee;
    }

}
