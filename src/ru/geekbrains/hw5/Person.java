package ru.geekbrains.hw5;

import java.util.Random;

/**
 * Created by AKhloptsev
 */
public class Person {
    private String fio;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;
    public static Random random = new Random();
    private static String[] name = {"Ivanov Ivan","Petrov Petr","Sidorov Nikolay","Smirnova Olga","Fedorov Fedor"};
    private static String[] positions ={"Manager","Engineer","CEO","Staff Manager","Economist"};




    public Person(int personNumber)
    {
        this.setFio(name[personNumber%5]);
        this.setPosition(positions[personNumber%5]);
        this.setEmail(makeEmailFromName(name[personNumber%5]));
        long phone =random.nextInt(9999999)+89030000000l;
        this.setPhone(phone);
        int salary = random.nextInt(100000)+30000;
        this.setSalary(salary);
        int age = random.nextInt(40)+22;
        this.setAge(age);
    }

    private static String makeEmailFromName(String str)
    {
        return str.replace(' ','_').concat("@compName.gmail.com");
    }

    public void printInfo(Person person)
    {
        System.out.print("Person name: " +person.getFio()+", person position:" +person.getPosition());
        System.out.println(", person email: " +person.getEmail()+", person phone:" +person.getPhone());
        System.out.println("Person salary: " +person.getSalary()+", person age:" +person.getAge());
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
       this.fio=fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int  getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
