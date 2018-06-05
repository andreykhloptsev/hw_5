package ru.geekbrains.hw5;




public class Main {
    private static final int PERSON_ARRAY_LENGTH=5;
    private static Person[] personArray = new Person[PERSON_ARRAY_LENGTH];




    public static void main(String[] args) {

        for (int i = 0; i <PERSON_ARRAY_LENGTH ; i++) {
            personArray[i] = new Person(i);
            personArray[i].printInfo(personArray[i]);
        }
        System.out.println("Из них старше 40 лет:");
        for (int i = 0; i <PERSON_ARRAY_LENGTH ; i++) {
            if (personArray[i].getAge() >= 40)
                personArray[i].printInfo(personArray[i]);
            }
    }
}
