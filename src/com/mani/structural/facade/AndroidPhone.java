package com.mani.structural.facade;

public class AndroidPhone implements Phone{
    @Override
    public String build() {
        return "os used is android";
    }
}
