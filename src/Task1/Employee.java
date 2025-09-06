package Task1;

public class Employee {
    private String name;
    private String lastName;
    private int yearOfBirth;
    private int workStartYear;

    public Employee(String name, String lastName, int yearOfBirth, int workStartYear) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.workStartYear = workStartYear;
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
