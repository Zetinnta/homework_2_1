package ru.skypro;

public class PersonService {
    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }

    public static void changePersonTest(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
}

