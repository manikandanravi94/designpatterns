package com.mani.behavioral.observor.observable;

import com.mani.behavioral.observor.observee.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservableIMPL implements StockObservable {

    List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();

    private int count;

    @Override
    public void add(NotificationAlertObserver obj) {
        notificationAlertObservers.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        notificationAlertObservers.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : notificationAlertObservers) {
            observer.update();
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void setData(int count) {
        if (count > 0) {
            this.setCount(count);
            notifySubscribers();
        }
    }

    @Override
    public int getData() {
        return 0;
    }
}
