package java_io;

import java.util.ArrayList;
import java.util.List;
class Student extends Comparable<Student> {
    Student(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }
    String name;
    int roll;
    int age;

    
}
public class Example {
    public static void main(String[] args) {
        int arr[] = {7, 9, 1, 2, 3, 4, 5, 6};
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("A", 7, 9);
        students.add(new Student("B", 9, 9);
        students.add(new Student("C", 11, 7);

        Comparator<Student> comparator = new Comparator((Student s1, Student s2) -> s2.getAge() - s1.getAge() - s2.get)

    }
}

