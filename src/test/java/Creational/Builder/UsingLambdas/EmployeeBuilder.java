package Creational.Builder.UsingLambdas;

import Creational.Builder.lambokPlugin.Employee;

import java.util.function.Consumer;

public class EmployeeBuilder {

    public String name;
    public int age;
    public int id;

    public EmployeeBuilder builder(Consumer<EmployeeBuilder> empbuilder)
    {
        empbuilder.accept(this);
        return this;
    }

    public Employee1 build()
    {
        return new Employee1(age,id,name);
    }
}
