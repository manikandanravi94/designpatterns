package com.mani.behavioral.memento;

public class ConfigurationOriginator {

    private int height;

    private int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }


    public ConfigurationMemento addMemento() {
        return new ConfigurationMemento(this.height, this.width);
    }

    public void restoreMemento(ConfigurationMemento configurationMemento){
        this.height=configurationMemento.getHeight();
        this.width=configurationMemento.getWidth();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "ConfigurationOriginator{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
