package com.mani.factory;

/**
 * Created by gbs05347 on 25-11-2019.
 */
public class AsusPhone implements Phone {

    @Override
    public String os() {
        return "Android";
    }

    @Override
    public String processor() {
        return "855 processor";
    }

    @Override
    public String battery() {
        return "5000 mah battery";
    }
}
