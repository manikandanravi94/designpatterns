package com.mani.behavioral.observor.observable;

import com.mani.behavioral.observor.observee.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver obj);

    public void remove(NotificationAlertObserver obj);

    public void notifySubscribers();

    public void setData(int count);

    public int getData();


}
