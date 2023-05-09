package com.mani.behavioral.Iterator;

public class NotificationIterator implements Iterator{

    private final Notification[] notifications;

    private int pos=0;

    public NotificationIterator(Notification[] notifications) {
        this.notifications=notifications;
    }

    @Override
    public boolean hasNext() {
        return pos <= notifications.length-1 && notifications[pos]!=null;
    }

    @Override
    public Object next() {
        Notification notification= notifications[pos];
        pos=pos+1;
        return notification;
    }
}
