package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Antochka","Kartoshka","13","50");
        try {
            System.out.println(JsonSerializationUtils.serialize(person));
        } catch(Exception e){
            System.out.println("Something goes wrong");
        }
    }
}