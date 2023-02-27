package java_class;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int classroom;
    String section;
    int age;

    public Student(String name, int classroom, String section, int age) {
        this.name = name;
        this.classroom = classroom;
        this.section = section;
        this.age = age;
    }
   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassroom() {
        return this.classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getSection() {
        return this.section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] toStringCustom() {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");
        List<String> fieldsArr = new ArrayList<>();

        result.append( this.getClass().getName() );
        result.append( " Object {" );
        result.append(newLine);
      
        //determine fields declared in this class only (no fields of superclass)
        Field[] fields = this.getClass().getDeclaredFields();
      
        //print field names paired with their values
        for ( Field field : fields  ) {
            try {
                fieldsArr.add((String)field.get(this));
            } catch (IllegalArgumentException | IllegalAccessException e) {
                System.out.println(e);
            }
        }
        String[] strings = fieldsArr.stream().toArray(String[]::new);
        return strings;
    }
   

}

public class ToString2 {
    public static void main(String[] args) {
        Student s1 = new Student("ABC", 3, "B", 17);
        System.out.println(s1.toStringCustom());
    }
}
