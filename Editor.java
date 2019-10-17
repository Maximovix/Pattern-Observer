package com.company;

public class Editor {
    EventManager events;

    public Editor(){
        this.events = new EventManager("event1","event2","event3");
    }

    public void event1(){
        System.out.println("Event 1:");
        events.notify("event1");
    }

    public void event2(){
        System.out.println("Event 2:");
        events.notify("event2");
    }

    public void event3(){
        System.out.println("Event 3:");
        events.notify("event3");
    }
}
