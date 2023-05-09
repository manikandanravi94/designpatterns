package com.mani.creational.singleton;

import java.math.BigDecimal;

public class Patterns {

    public static void main(String[] args) {
        IEmployeeDetail singletonPatternInstance= EmployeeDetailImpl.getSingletonPatternInstance();
        Employee employee=new Employee("manikandan", "Ravi", "Sofware developer", new BigDecimal(20000));
        System.out.println(singletonPatternInstance.hashCode());
        BigDecimal salary =singletonPatternInstance.getSalary(employee);
        IEmployeeDetail singletonPatternInstance1= EmployeeDetailImpl.getSingletonPatternInstance();
        System.out.println(singletonPatternInstance1.getSalary(employee));
        System.out.println(singletonPatternInstance1.hashCode());
        System.out.println("salary of a employee: "+salary);
    }
}
