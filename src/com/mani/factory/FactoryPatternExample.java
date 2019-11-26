package com.mani.factory;

/**
 * Created by gbs05347 on 26-11-2019.
 */
public class FactoryPatternExample {

    /*
    1.Doesn't expose instantiation or the creation logic
    2.subclasses create the object
    3.common interface--> functionalities willbe abstracted and hence all the logics in the consumer class will be in the single line
     */
    public static void main(String[] args) {
        Phone asusPhone = PhoneFactory.getPhone(PhoneType.ASUS);
        System.out.println("processor: "+asusPhone.processor()+" battery:"+asusPhone.battery()+" OS: "+asusPhone.os());
        Phone iPhone=PhoneFactory.getPhone(PhoneType.IPHONE);
        System.out.println("processor: "+iPhone.processor()+" battery:"+iPhone.battery()+" OS: "+iPhone.os());

    }
}
