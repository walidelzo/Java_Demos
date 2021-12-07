package com.company.oop.enumration;
import static com.company.oop.enumration.PowerStat.*;
public class HpComputer  extends ElectronicDevice{
    private PowerStat powerStat = OFF;
    @Override
    public void turnOn() {
        powerStat = ON;
    }

    @Override
    public void turnOff() {powerStat = OFF;}

    @Override
    public void suspend() {
        powerStat = SUSPEND;
    }

    public void setPowerStat(PowerStat state){
        switch (state){
            case ON :
                turnOn();
                break;
            case OFF:
                turnOff();
                break;
            case SUSPEND:
                suspend();
                break;
        }    }
}
