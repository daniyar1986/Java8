package khorstmann.ch2;

import org.jetbrains.annotations.Contract;

import java.util.Random;

public class Employee {
    private String name = "";
    private double salary;
    private int id;
    private static int lastId = 0;

    {
        Random random = new Random();
        id = 1 + random.nextInt(1_000_000);
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Contract(pure = true)
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("", salary);
    }

    public Employee(String name) {
        this.name = name;
    }


    public Employee() {
        name = "";
        salary = 0;
        lastId++;
        id = lastId;
    }
}
