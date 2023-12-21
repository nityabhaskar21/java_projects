package java_collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()>o.getAge()?1:-1;
    }
    
    @Override
    public String toString() {
        return "Student: " + age + name;
    }
    
}
public class ComparablerEx {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, "Harry"));
        students.add(new Student(34, "Amy"));
        students.add(new Student(30, "Caty"));

        Collections.sort(students);

        System.out.println(students);
    }
}
