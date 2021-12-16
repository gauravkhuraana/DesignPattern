package Creational.Builder.UsingInnerStaticClass;

    public class Employee {

        private int age;
        private int empid;
        private String name;

        public int getAge() {
            return age;
        }

        public int getEmpid() {
            return empid;
        }

        public String getName() {
            return name;
        }



        private Employee(int age, int empid, String name) {
            this.age = age;
            this.empid = empid;
            this.name = name;
        }

        public static EmployeeBuilder builder()
        {
            return new EmployeeBuilder();
        }

       // creating static inner class

        public static class EmployeeBuilder
        {
            private int age;
            private int empid;
            private String name;

            public Employee build()
            {
                return new Employee(age,empid,name);
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

    }