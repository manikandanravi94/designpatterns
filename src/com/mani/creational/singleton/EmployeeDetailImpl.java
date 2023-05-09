package com.mani.creational.singleton;

import java.math.BigDecimal;

/**
 * Created by gbs05347 on 25-11-2019.
 */
public class EmployeeDetailImpl implements IEmployeeDetail {

/*
1. only one instance of the class gets created.
2.Since the class controls the instantiation process, the class has the flexibility to change the instantiation process
3. Easy to implement
 */
    private static EmployeeDetailImpl employeeDetailSingletonInstance;


    private EmployeeDetailImpl(){

    }

    public static EmployeeDetailImpl getSingletonPatternInstance(){
        if(employeeDetailSingletonInstance ==null)
        {
            /* adding synchroinzed at the method starting point will reduce the performance of the app as it is called everytime
               if we add it here we can reduce the synchronization check at the next level of the method calling..
               performance will not be affected
             */
            synchronized (EmployeeDetailImpl.class) {
                employeeDetailSingletonInstance = new EmployeeDetailImpl();
            }
        }
        return employeeDetailSingletonInstance;
    }


    @Override
    public BigDecimal getSalary(Employee employee) {
        return employee.getSalary();
    }
}
