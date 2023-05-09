package com.mani.creational.builder;

/**
 * Created by gbs05347 on 30-04-2020.
 */
public class Phone {

    private String camera;

    private String processor;

    private String name;

    private String battery;

    public static class PhoneBuilder {

        private String camera;

        private String processor;

        private String name;

        private String battery;

        public PhoneBuilder() {

        }

        public Phone build() {
            return new Phone(this);
        }


        public PhoneBuilder setCamera(String camera) {
            this.camera = camera;
            return this;
        }

        public PhoneBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public PhoneBuilder setname(String name) {
            this.name = name;
            return this;
        }

        public PhoneBuilder setbattery(String battery) {
            this.battery = battery;
            return this;
        }

    }

    private Phone(PhoneBuilder builder) {
        this.camera = builder.camera;
        this.processor = builder.processor;
        this.battery = builder.battery;
        this.name = builder.name;
    }

    public String getCamera() {
        return camera;
    }

    public String getProcessor() {
        return processor;
    }

    public String getName() {
        return name;
    }

    public String getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Phone{");
        sb.append("camera='").append(camera).append('\'');
        sb.append(", processor='").append(processor).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", battery='").append(battery).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
