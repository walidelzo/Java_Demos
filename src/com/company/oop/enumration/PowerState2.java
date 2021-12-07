package com.company.oop.enumration;

public enum PowerState2 {
    On(""),
    OFF(""),
    SUSPEND("");
    private String description;
    private PowerState2(String str){
        description =str;
    }

    public String getDescription() {
        return description;
    }
}
