package com.mani.singleton;

import java.math.BigDecimal;

public class Patterns {

    public static void main(String[] args) {
        ISingletonPattern singletonPatternInstance= SingletonPatternImpl.getSingletonPatternInstance();
        Employee employee=new Employee("manikandan", "Ravi", "Sofware developer", new BigDecimal(20000));
        System.out.println(singletonPatternInstance.hashCode());
        BigDecimal salary =singletonPatternInstance.getSalary(employee);
        ISingletonPattern singletonPatternInstance1= SingletonPatternImpl.getSingletonPatternInstance();
        System.out.println(singletonPatternInstance1.getSalary(employee));
        System.out.println(singletonPatternInstance1.hashCode());
        System.out.println("salary of a employee: "+salary);
    }
}
