package com.mani.behavioral.strategy;

public class MultiplicationStrategy implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a*b;
    }
}
