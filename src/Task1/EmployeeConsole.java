package Task1;

import Task1.exceptions.EmployeeNamesException;
import Task1.exceptions.EmployeeYearException;

public class EmployeeConsole extends Employee {
    public EmployeeConsole() {

    }

    public Employee runEmployee() {
        while (true) {
            try {
                askName();
                break;
            } catch (EmployeeNamesException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                askLastName();
                break;
            } catch (EmployeeNamesException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                askBirthDate();
                break;
            } catch (EmployeeYearException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                askWorkStartYear();
                break;
            } catch (EmployeeYearException e) {
                System.out.println(e.getMessage());
            }
        }

        return this;
    }

    public void askWorkStartYear() throws EmployeeYearException {
        this.workStartYear = validateYears("начала работы");

        int validWorkYear = this.yearOfBirth + 18;

        if (this.workStartYear < validWorkYear) {
            throw new EmployeeYearException("Год начала опыта работы меньше чем когда сотруднику исполнилось 18");
        }
    }

    public void askBirthDate() throws EmployeeYearException {
        this.yearOfBirth = validateYears("рождения");
    }

    public void askLastName() throws EmployeeNamesException {
        this.lastName = validateNames("фамилию");
    }

    public void askName() throws EmployeeNamesException {
        this.name = validateNames("имя");
    }
}
