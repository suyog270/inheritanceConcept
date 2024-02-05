package Model;

import java.util.List;

public class employee extends member{


    public employee(String name, int age, String contact, String address, int salary) {
        super(name, age, contact, address, salary);
    }

    public void giveInfo(){
        System.out.println("This is info");
    }
}
