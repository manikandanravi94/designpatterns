package com.mani.singleton;

import java.math.BigDecimal;

/**
 * Created by gbs05347 on 25-11-2019.
 */
public class Employee {

    private String firstName;

    private String lastName;

    private String designation;

    private BigDecimal salary;


    public Employee(String firstName, String lastName, String designation, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
