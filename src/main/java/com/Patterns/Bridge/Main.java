package com.Patterns.Bridge;

public class Main {
    public static void main(String[] args) {

        Remote tvRemote = new Remote(new TV());
        tvRemote.powerOn();

        Remote radioRemote = new Remote(new Radio());
        radioRemote.powerOn();
    }
}
