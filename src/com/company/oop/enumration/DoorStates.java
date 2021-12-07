package com.company.oop.enumration;

public enum DoorStates {
    OPEN("the door is open"),
    CLOSED("the door is closed");
    private String desc;
    private DoorStates(String desc){
        this.desc= desc;
    }

    public String getDesc() {
        return desc;
    }
}
