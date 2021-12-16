package Creational.Builder.UsingLambdas;



public class UseBuilder {

    public static void main(String[] args) {



        Employee1 emp = new EmployeeBuilder().builder(
                $ -> {
                    $.name="Hare";
                    //employeeBuilder can be replaced with $
                    $.age = 125;
                    $.id = 1349;

                }
        ).build();

        System.out.println(emp.toString());
        System.out.println(emp.age);
        System.out.println(emp.id);
        System.out.println(emp.name);
    }
}
