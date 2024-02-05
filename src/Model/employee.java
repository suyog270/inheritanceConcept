package Model;

import java.util.List;

public class employee extends member{

    String department;

    public employee(String name, int age, String contact, String address, int salary_per_day, String department) {
        super(name, age, contact, address, salary_per_day);
        this.department = department;
    }
}
