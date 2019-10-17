package com.company;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("event1",new Listener1());
        editor.events.subscribe("event1",new Listener3());
        editor.events.subscribe("event2",new Listener2());

        editor.event1();
        editor.event2();
    }
}
