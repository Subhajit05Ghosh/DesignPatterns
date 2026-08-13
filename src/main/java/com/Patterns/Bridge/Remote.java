package com.Patterns.Bridge;

class Remote {
    Device device;

    Remote(Device device) {
        this.device = device;
    }

    void powerOn() {
        device.turnOn();
    }
}
