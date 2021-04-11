package com.melnik.spring.mvc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 15, message = "name mast be min 2 symbols")
    private String name;
//    @NotEmpty(message = "Surname is required field")
    @NotBlank(message = "Surname is required field")
    private String surname;
    private int salary;
    private String department;
    private String car;
    private Map<String, String> departments;
    private Map<String, String> cars;
    private Map<String, String> languageList;
    private String[] languages;


    public Employee() {
        departments = new HashMap<>();
        departments.put("Info tehno", "IT");
        departments.put("Human resources", "HR");
        departments.put("Sales", "sales");

        cars = new HashMap<>();
        cars.put("bmw", "BMW");
        cars.put("reno", "RENO");
        cars.put("opel", "OPEL");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("French", "FR");
        languageList.put("Ukrainian", "UKR");

    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setDepartments(Map<String, String> department) {
        this.departments = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + departments + '\'' +
                '}';
    }

}
