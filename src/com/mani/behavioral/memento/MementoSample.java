package com.mani.behavioral.memento;


//memnto will be mostly used for undo the object state
public class MementoSample {

    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

        //object of its state, we wish to maintain
        ConfigurationOriginator originator = new ConfigurationOriginator(10,20);

        careTaker.add(originator.addMemento());

        originator.setHeight(15);
        originator.setWidth(25);

        System.out.println("replaced inital value" + originator);

        originator.restoreMemento(careTaker.undo());

        System.out.println("After restoring : "+ originator);
    }
}
