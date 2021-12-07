/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 12/3/21, 3:27 PM.                             -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.threads.snychronnization;




class ATM2
{

    synchronized public void checkBalance(String name)
    {
        System.out.print(name + " Checking ");

        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println("Balance");
    }

    synchronized public void withdraw(String name,int amount)
    {
        System.out.print(name + " withdrawing ");

        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println(amount);

    }
}

class Customer extends Thread
{
    String name;
    int amount;
    ATM2 atm;

    Customer(String n,ATM2 a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}

public class SCThread1
{
    public static void main(String[] args)
    {
        ATM2 atm=new ATM2();
        Customer c1=new Customer("Smith",atm,100);
        Customer c2=new Customer("John",atm,200);
        c1.start();
        c2.start();


    }
}
