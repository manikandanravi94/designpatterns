package com.mani.creational.facade;

//it is used to hide complex logic written in subsystem to client..
//disadvantage -- > more the facade class in your app.. it shows more complex ur system is.
public class FacadeDemo {

    public static void main(String[] args) {
      FacadePhone phone = new FacadePhone();
        System.out.println(phone.getAndroidPhone());
        System.out.println(phone.getIPhone());
    }
}
