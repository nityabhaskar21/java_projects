package design_patterns.creational.prototype_registry;

public class Student implements Prototype<Student> {
    int id;
    String name;
    double psp;

    @Override
    public Student copy() {
        Student s = new Student();
        s.id = this.id;
        s.name = this.name;
        s.psp = this.psp;
        return s;
    }
}
