package com.mani.creational.facade;

public class Iphone implements Phone{
    @Override
    public String build() {
        return "os used is mac";
    }
}
