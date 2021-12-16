package Creational.Builder.lambokPlugin;

//@Setter
//

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder (setterPrefix = "set", builderMethodName = "perform")
public class Employee {

        private int age;
        private int empid;
        private String name;

    public Employee(int age, int empid, String name) {
        this.age = age;
        this.empid = empid;
        this.name = name;
    }


    public static void main(String[] args)
        {

            //Employee Emp= Employee.builder().setAge(400).setEmpid(400).setName("Hare Krishna").build();
            Employee Emp= Employee.perform().setAge(400).setEmpid(400).setName("Hare Krishna").build();
            System.out.println(Emp.age);
            System.out.println(Emp.name);

            // to
            System.out.println(Emp.perform().toString());



        }


}

