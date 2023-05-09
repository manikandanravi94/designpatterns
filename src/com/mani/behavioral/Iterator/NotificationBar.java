package com.mani.behavioral.Iterator;

/*
Iterator pattern is used to provide common iterator logic to iterate the different data structures
one of the advantage is that their own implementaion will be hidden in their class itself
 */
public class NotificationBar {



    public static void main(String[] args) {
        NotificationCollection notifications = new NotificationCollection();
        notifications.add("Test message");
        notifications.add("Test iterator pattern");
        notifications.add("Test while has next()");
        Iterator it = notifications.createIterator();

        while (it.hasNext()){
            System.out.println(((Notification)it.next()).getMessage());
        }
    }

}
