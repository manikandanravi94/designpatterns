package com.mani.singleton;

import java.math.BigDecimal;

/**
 * Created by gbs05347 on 25-11-2019.
 */
public class SingletonPatternImpl implements ISingletonPattern{

/*
1. only one instance of the class gets created.
2.Since the class controls the instantiation process, the class has the flexibility to change the instantiation process
3. Easy to implement
 */
    private static SingletonPatternImpl singletonPattern;


    private SingletonPatternImpl(){

    }

    public static SingletonPatternImpl getSingletonPatternInstance(){
        if(singletonPattern==null)
        {
            /* adding synchroinzed at the method starting point will reduce the performance of the app as it is called everytime
               if we add it here we can reduce the synchronization check at the next level of the method calling..
               performance will not be affected
             */
            synchronized (SingletonPatternImpl.class) {
                singletonPattern = new SingletonPatternImpl();
            }
        }
        return singletonPattern;
    }


    @Override
    public BigDecimal getSalary(Employee employee) {
        return employee.getSalary();
    }
}
