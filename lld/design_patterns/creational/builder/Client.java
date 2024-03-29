package lld.design_patterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        //Builder builder = new Builder();

        // StudentBuilder builder = Student.getBuilder();
        // builder.setAge(17);
        // builder.setGradYear(2020);
        // builder.setName("Ravi");

        Student student = Student.getBuilder()
                            .setAge(17)
                            .setName("Ravi")
                            .setGradYear(2020)
                            .build();
    }
}
