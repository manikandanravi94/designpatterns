package com.mani.behavioral.observor;

import com.mani.behavioral.observor.observable.IPhoneStockObservableIMPL;
import com.mani.behavioral.observor.observable.StockObservable;
import com.mani.behavioral.observor.observee.EmailAlertNotificationObserver;

public class Stock {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable= new IPhoneStockObservableIMPL();

        EmailAlertNotificationObserver emailAlertNotificationObserver= new EmailAlertNotificationObserver("mani@gmail.com", new IPhoneStockObservableIMPL());
        EmailAlertNotificationObserver emailAlertNotificationObserver1= new EmailAlertNotificationObserver("mani@gmail.com", new IPhoneStockObservableIMPL());
        EmailAlertNotificationObserver emailAlertNotificationObserver2= new EmailAlertNotificationObserver("mani@gmail.com", new IPhoneStockObservableIMPL());

        iphoneStockObservable.add(emailAlertNotificationObserver1);
        iphoneStockObservable.add(emailAlertNotificationObserver2);
        iphoneStockObservable.add(emailAlertNotificationObserver);

        iphoneStockObservable.setData(10);

    }
}
