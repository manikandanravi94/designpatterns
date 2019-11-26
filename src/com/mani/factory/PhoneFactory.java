package com.mani.factory;

/**
 * Created by gbs05347 on 26-11-2019.
 */
public class PhoneFactory {

    public static Phone getPhone(PhoneType phoneType){
        Phone phone=null;
        switch(phoneType){
            case ASUS:
                phone= new AsusPhone();
                break;
            case IPHONE:
                phone= new IPhone();
                break;
        }
        return phone;
    }
}
