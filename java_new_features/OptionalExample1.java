package java_new_features;

import java.util.Optional;

class Student {
    String name;

    String getName() {
        return name;
    }

    Student(String name) {
        this.name = name;
    }

}

public class OptionalExample1 {
    public static void main(String[] args) {
        Student s1 = new Student("a");
        Student s2 = new Student(null);

        System.out.println(s1.getName());   //a
        System.out.println(s2.getName());   //null



        String name1 = Optional.ofNullable(s1.getName()).orElse("default"); 
        String name2 = Optional.ofNullable(s2.getName()).orElse("default"); 
        System.out.println();
        System.out.println(name1);  //a
        System.out.println(name2);  //default

        
        String name3 = s1.getName();
        String name4 = s2.getName(); 
        System.out.println();
        System.out.println(Optional.ofNullable(name3).map(name->name).orElse("default"));  //a
        System.out.println(Optional.ofNullable(name4).map(name->name).orElse("default"));  //default


    }
    
}