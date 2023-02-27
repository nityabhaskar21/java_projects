package java_class;

import java.lang.reflect.Field;

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");
      
        result.append( this.getClass().getName() );
        result.append( " Object {" );
        result.append(newLine);
      
        //determine fields declared in this class only (no fields of superclass)
        Field[] fields = this.getClass().getDeclaredFields();
      
        //print field names paired with their values
        for ( Field field : fields  ) {
          result.append("  ");
          try {
            result.append( field.getName() );
            result.append(": ");
            //requires access to private field:
            result.append( field.get(this) );
          } catch ( IllegalAccessException ex ) {
            System.out.println(ex);
          }
          result.append(newLine);
        }
        result.append("}");
      
        return result.toString();
    }
   

}

public class ToString {
    public static void main(String[] args) {
        Student s1 = new Student("ABC", 3, "B", 17);
        System.out.println(s1.toString());
    }
}
