package com.mani.factory;

/**
 * Created by gbs05347 on 25-11-2019.
 */
public class IPhone implements Phone {
    @Override
    public String os() {
        return "Iphone os";
    }

    @Override
    public String processor() {
        return "Iphone processor";
    }

    @Override
    public String battery() {
        return "3000mah";
    }
}
