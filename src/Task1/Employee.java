package Task1;

import java.util.Scanner;

public class Employee {
    private String name;
    private String lastName;
    private int yearOfBirth;
    private int workStartYear;

    public Employee() {

    }

    public void askEmployeeData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя сотрудника: ");
        name = input.nextLine();
        System.out.print("Введите фамилию сотрудника: ");
        lastName = input.nextLine();

        System.out.println("Введите год рождения сотрудника: ");
        yearOfBirth = input.nextInt();
        System.out.println("Введите начало года работы сотруднкиа: ");
        workStartYear = input.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getWorkStartYear() {
        return workStartYear;
    }

    public void setWorkStartYear(int workStartYear) {
        this.workStartYear = workStartYear;
    }
}
