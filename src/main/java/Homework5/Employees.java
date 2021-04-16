package Homework5;

import javax.swing.*;

public class Employees {


    private String name;
    private String job_role;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    public Employees(String name, String job_role, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.job_role = job_role;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;

    }


    public void info() {
        System.out.println("Имя пользователя: " + name +
                "; Должность: " + job_role +
                "; email'" + email +
                "; Телефон: " + phone_number +
                "; Зарплата: " + salary +
                "; Возраст: " + age);
    }

    public String getName() {
        return name;
    }

    public String getJob_role() {
        return job_role;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob_role(String job_role) {
        this.job_role = job_role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void newEmployees() {

        Employees[] persArray = new Employees[5];
        persArray[0] = new Employees("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45);
        persArray[1] = new Employees("Petrov Peter", "QA/QC", "ppetrov@mailbox.com", "892312231", 15000, 25);
        persArray[2] = new Employees("Ivanova Galina", "Accountant", "givanova@mailbox.com", "892312310", 20000, 42);
        persArray[3] = new Employees("Petrova Olga", "HR", "opetrova@mailbox.com", "892312123", 10000, 23);
        persArray[4] = new Employees("Sidorov Alexey", "Manager", "asidorov@mailbox.com", "892312666", 80000, 50);

        for (Employees employees : persArray) {

            if (employees.getAge() > 40) {
                employees.info();
            }

        }

    }
    
}



