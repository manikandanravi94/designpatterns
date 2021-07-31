package com.mani.builder;

/**
 * Created by Manikandan on 30-04-2020.
 * Advantages:
 * We can create a immutable object, constructor overloading will be reduced for immutable
 * Disadvantages:
 * We need to write more lines of code.. we need to replicated all the members of a class again to the builder class
 */
public class BuilderPatternImpl {

    public static void main(String[] args) {


/**
 *      Phone iPHone = new Phone(builder);
 *      We can't create a phone object directly since we made it as a private constructor
 *      We can create instance to phone only through builder object
 *       Phone.PhoneBuilder builder = new Phone.PhoneBuilder();
 *      we need to create a instance of builder to create instance of a phone
 */
        Phone asusPhone = new Phone.PhoneBuilder().setbattery("5000mah").setCamera("48 mp").setname("Asus z").setProcessor("sd 865").build();
        System.out.println("Immutable object created tru design pattern" + asusPhone);
        Phone zeePHone=new Phone.PhoneBuilder().build();
        System.out.println(zeePHone);

    }
}
