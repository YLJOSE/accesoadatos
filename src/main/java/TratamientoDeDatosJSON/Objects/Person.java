package TratamientoDeDatosJSON.Objects;

import java.util.StringJoiner;

public class Person {
    private int id;
    private String name;
    private String lastName;
    private String age;

    private Person(int id, String name, String lastName, String age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("lastName='" + lastName + "'")
                .add("age='" + age + "'")
                .toString();
    }
}
