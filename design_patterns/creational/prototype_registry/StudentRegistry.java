package design_patterns.creational.prototype_registry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    public void registerStudent(String key, Student student) {
        map.put(key, student);
    }

    public Student getStudent(String key) {
        return map.get(key).copy();
    }
}
