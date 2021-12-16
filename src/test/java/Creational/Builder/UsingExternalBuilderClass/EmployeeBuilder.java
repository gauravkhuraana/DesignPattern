package Creational.Builder.UsingExternalBuilderClass;

public class EmployeeBuilder {

    private int age;
    private int empid;
    private String name;

    public EmployeeBuilder() {

    }

    public EmployeeBuilder(int age, int empid, String name) {
        this.age = age;
        this.empid = empid;
        this.name = name;
    }

    public static EmployeeBuilder build()
    {
        return new EmployeeBuilder();
    }

    public int getAge() {
        return age;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }


    public EmployeeBuilder and()
    {
        return this;
    }

    public EmployeeBuilder with()
    {
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder setEmpid(int empid) {
        this.empid = empid;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }
}
