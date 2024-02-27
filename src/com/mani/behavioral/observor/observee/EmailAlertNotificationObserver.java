package com.mani.behavioral.observor.observee;

import com.mani.behavioral.observor.observable.StockObservable;

public class EmailAlertNotificationObserver implements NotificationAlertObserver{

    private String email;

    private StockObservable stockObservable;

    public EmailAlertNotificationObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println(this.email);
    }
}
