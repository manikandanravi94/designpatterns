package com.mani.behavioral.strategy;

import java.util.Scanner;

public class StrategyImpl {

    public static void main(String[] args) {
        Strategy strategy;
        Scanner sc = new Scanner(System.in);
        String operation =sc.next();
        if("add".equalsIgnoreCase(operation)){
            strategy = new AddStrategy();
        }else if("sub".equalsIgnoreCase(operation)){
            strategy=new subtractStrategy();
        }else if("mul".equalsIgnoreCase(operation)){
            strategy=new MultiplicationStrategy();
        }else{
            strategy= new DefaultStrategy();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArithmeticOperationService service = new ArithmeticOperationService(strategy);
        System.out.println(service.execute(a, b));
    }
}
