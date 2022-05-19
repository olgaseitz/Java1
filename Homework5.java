package ru.geekbrains.hw5;

public class Homework5 {
    private static final int minAge = 40;

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Jack", "Daniels", "CEO", "1@qw.com", "5634754", 250000, 50);
        employeesArray[1] = new Employee("Jane","Daniels", "Accountant", "2@qw.com", "5632875", 200000, 41);
        employeesArray[2] = new Employee("Jane","Air", "Secretary", "3@qw.com", "5632870", 30000, 20);
        employeesArray[3] = new Employee("John","Deacon", "Manager", "4@qw.com", "5632871", 100000, 45);
        employeesArray[4] = new Employee("Jack","Sparrow", "Manager", "5@qw.com", "5632872", 80000, 30);


        for (Employee employee : employeesArray) {
            if (employee.getAge() > minAge) {
                employee.printEmployee();
            }
        }
    }
}
