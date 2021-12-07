/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 12/3/21, 3:11 PM.                             -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.threads.snychronnization;

public class ATM {
   synchronized void checking(String name){
        System.out.print(name+" checking ....");
        try {
            Thread.sleep(1000);
        }catch (Exception e){}
        System.out.println("balanced");
    }

   synchronized void withdraw(String name , int amount){
        System.out.print(name + " withdraw...");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(amount);
    }
}
class User1 extends Thread
{
    ATM atm;
    User1(ATM atm){
        this.atm = atm;
    }
    @Override
    public void run(){
        atm.checking("ali");
        atm.withdraw("ali",3000);
    }
}
class User2 extends Thread {
    ATM atm;
    User2(ATM atm){
        this.atm=atm;
    }
    @Override
    public void run(){
        atm.checking("saad");
        atm.withdraw("saad",4000);
    }

}

class TestAtm{
    public static void main(String[] args) {
        ATM atm = new ATM();
        User1 user1 = new User1(atm);
        User2 user2 = new User2(atm);
        user1.start();
        user2.start();
    }

}