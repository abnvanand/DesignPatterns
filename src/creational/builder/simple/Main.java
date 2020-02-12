package creational.builder.simple;

public class Main {
    public static void main(String[] args) {
        Person.Builder personBuilder = new Person.Builder();
        personBuilder
                .setFirstName("Abhinav")
                .setLastName("Anand");

        personBuilder.setAge(25);

        Person p = personBuilder.build();
        System.out.println(p);


    }
}
