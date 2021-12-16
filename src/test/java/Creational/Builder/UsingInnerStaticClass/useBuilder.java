package Creational.Builder.UsingInnerStaticClass;

public class useBuilder {

    public static void main(String[] args)
    {
        // calling the builder method which will return the inner class object
        // then append the set methods and finally the build method which calls
        // the parent constructor and initalised the values received
        Employee arjun = Employee.builder().setAge(20).setName("Gaurav").build();

        System.out.println(arjun.getAge());
        // Since we did not initialised it took the default value 0
        System.out.println(arjun.getEmpid());
    }
}
