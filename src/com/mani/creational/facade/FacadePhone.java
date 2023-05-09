package com.mani.creational.facade;

public class FacadePhone {

    private AndroidPhone androidPhone;

    private Iphone iphone;

    public FacadePhone(){
        this.androidPhone=new AndroidPhone();
        this.iphone= new Iphone();
    }

    public String getAndroidPhone(){
        return androidPhone.build();
    }
    public String getIPhone(){
        return  iphone.build();
    }
}
