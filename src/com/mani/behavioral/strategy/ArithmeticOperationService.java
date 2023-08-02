package com.mani.behavioral.strategy;

public class ArithmeticOperationService {

    private final Strategy strategy;

    public ArithmeticOperationService(Strategy strategy){
        this.strategy=strategy;
    }

    public int execute(int a, int b){
        return strategy.execute(a,b);
    }
}
