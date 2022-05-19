package ru.geekbrains.hw5;

public class Employee {

    private String name;
    private String surname;
    private String rank;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String surname, String rank, String email, String phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.rank = rank;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printEmployee() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Employee: " +
                "Name - " + name +
                ", Surname - " + surname +
                ", Rank - " + rank +
                ", Email - " + email +
                ", Phone - " + phone +
                ", Salary - " + salary +
                ", Age - " + age;
    }
}
