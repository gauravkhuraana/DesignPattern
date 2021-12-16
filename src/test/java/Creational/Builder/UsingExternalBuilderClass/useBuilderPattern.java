package Creational.Builder.UsingExternalBuilderClass;

public class useBuilderPattern {

    public static void main(String[] args) {


        EmployeeBuilder obj3 = new EmployeeBuilder(10,1560,"Udzial Means Share");

        EmployeeBuilder obj1 = EmployeeBuilder.build()
                .and()
                .setAge(10)
                .setName("Gaurav Khurana")
                .setEmpid(1560)
                .with();

        EmployeeBuilder obj2 = EmployeeBuilder.build()
                .and()
                .setAge(400)
                .setName("hari bol");

        System.out.println("First object we stored only few elements without constructor overloading" );
        System.out.println("second object we avoided empid and still it worked");
        System.out.println(obj1.getAge());
        System.out.println(obj2.getName());
    }
}
