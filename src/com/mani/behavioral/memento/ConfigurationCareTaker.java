package com.mani.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {

    private List<ConfigurationMemento> mementoList = new ArrayList<>();

    public void add(ConfigurationMemento configurationMemento) {
        mementoList.add(configurationMemento);
    }

    public ConfigurationMemento undo() {
        if (mementoList.size() > 0) {
            ConfigurationMemento configurationMemento = mementoList.get(mementoList.size() - 1);
            mementoList.remove(configurationMemento);
            return configurationMemento;
        }
        return null;
    }
}
