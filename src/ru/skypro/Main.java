package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int value = 33;
        Integer secondValue = 22;

        changeValue(value);
        System.out.println(value);

        changeSecondValue(secondValue);
        System.out.println(secondValue);

        Integer[] thirdValue = {1, 2};
        for (Integer testValue : thirdValue) {
            System.out.print(testValue + " ");
        }
        System.out.println();

        Person person = new Person("Lyapis", "Trubetskoi");
        PersonService.changePerson(person);
        System.out.println(person.toString());
        System.out.println();
        PersonService.changePersonTest(person);
        System.out.println(person.toString());
    }

    public static void changeValue(int change) {
        change = 22;
    }

    public static void changeSecondValue(Integer change) {
        change = 22;
    }

    public static void changeThirdValue(Integer[] change) {
        for (Integer test : change) {
         test += 2;
        }
    }
}
