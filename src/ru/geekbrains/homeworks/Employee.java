package ru.geekbrains.homeworks;
//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
public class Employee {
    private String full_name;
    private String position;
    private String email;
    private String tel;
    private int salary;
    private int age;
    public Employee(){}

    // Конструктор
    public Employee (String full_name, String position, String email, String tel, int salary,int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    //Геттеры
    public String getFull_name() {
        return full_name;
    }
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPosition(){return position;}
    public void setPosition(String position){this.position = position;}

    public String getEmail() {return email;}
    public void setEmail(String email){this.email = email;}

    public String getTel() {return tel;}
    public void setTel(String tel) {this.tel = tel;}

    public int getSalary() {return salary;}
    public void setSalary(int salary){this.salary = salary;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}


    @Override
    public String toString() {
        return "Employee{" +
                "full_name ='" + full_name + '\'' +
                ", position ='" + position + '\'' +
                ", email ='" + email + '\'' +
                ", tel =" + tel + '\'' +
                ", salary =" + salary + '\'' +
                ", age =" + age +
                '}';
    }
}