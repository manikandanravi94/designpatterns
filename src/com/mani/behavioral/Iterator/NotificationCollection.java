package com.mani.behavioral.Iterator;

public class NotificationCollection implements Collection{

    private static final int MAX_SIZE = 10;

    private int noOfItems=0;
    Notification[] notifications;

    public NotificationCollection() {
        this.notifications = new Notification[MAX_SIZE];
    }

    public void add(String message){
        if(this.noOfItems<MAX_SIZE){
            notifications[this.noOfItems]=new Notification(message);
            this.noOfItems++;
        }else{
            System.out.println("size full");
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }
}
