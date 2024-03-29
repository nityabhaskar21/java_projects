package lld.design_patterns.creational.builder;

public class Student {
    String name;
    int age;
    int id;
    int gradYear;
    String batch;
    double psp;
    public static class StudentBuilder {
        String name;
        int age;
        int id;
        int gradYear;
        String batch;
        double psp;
    
        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }
        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }
        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public int getId() {
            return id;
        }
        public int getGradYear() {
            return gradYear;
        }
        public String getBatch() {
            return batch;
        }
        public double getPsp() {
            return psp;
        }
    
        public Student build() {
            //validations
            if (this.getAge()>25) {
                throw new IllegalArgumentException();
            }
            if (this.getGradYear()<2020) {
                throw new IllegalArgumentException();
            }
            return new Student(this);
        }
        
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    private Student(StudentBuilder builder) {
        this.age = builder.getAge();
        this.name = builder.getName();
        this.gradYear = builder.getGradYear();
    }
}