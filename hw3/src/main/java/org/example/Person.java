package org.example;

@JsonSerializable
public class Person {

    @IgnoreNull
    public String firstname;

    @JsonElement(name = "name")
    public String lastname;

    @JsonElement()
    public String age;

    public String weight;


    public Person(String firstname, String lastname, String age, String weight) {
        this.firstname = lastname;
        this.lastname = lastname;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname=" + firstname +
                ", lastname=" + lastname +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
