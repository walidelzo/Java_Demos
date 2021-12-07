package com.company.oop.casting;

public class Machine {
    private String id;
    private String name;
    public Machine(String id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public boolean equals(Object obj) {
        boolean result=false;
        obj = (Machine) obj;
        if(obj!=null && obj instanceof Machine){
            if (this.id.equals(((Machine) obj).id) && this.name.equals(((Machine) obj).name)){
            result = true;}
        }else {
            result = false;
        }
        return result;
    }
}
