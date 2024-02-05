import Model.Manager;
import Model.employee;
public class MainI {
    public static void main(String[] args) {

        Manager m1 = new Manager("abcd", 30, "98746235243", "kohalpur", 90, "A");

        System.out.println("Salary for " + m1.getName() + " is " + m1.getSalary(2));

        employee e1 = new employee(
                "Employee1",
                65,
                "12345",
                "dfdrg",
                40,
                "B"
        );

        System.out.println("Salary for " + e1.getName() + " is " + e1.getSalary(5));
    }
}

