/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 12/3/21, 5:46 PM.                             -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.threads.snychronnization;
class Data {
    int value;
    boolean flag = true;
    synchronized void setValue(int v){
        while(flag!=true)
            try{wait();}catch (Exception e){}
        this.value=v;
        flag=false;
        notify();
    }
  synchronized   int get(){
        int x =0;
        while (flag!=false)
            try{wait();}catch (Exception e){}
        flag=true;
        x=value;
        notify();
        return x;
    }
}
class Producer extends Thread{
    Data data;
    Producer(Data data){
        this.data = data;
    }
    @Override
    public void run(){
        int count = 1;
        while(true){
        data.setValue(count);
            System.out.println("producer : "+count);
        count ++;
        }
    }
}
class Consumer extends Thread{
    Data data;
    Consumer(Data data){
        this.data = data;
    }
    @Override
    public void run(){
        while (true){
            int v=0;
            v=data.get();
            System.out.println("consumer : "+v);
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        Data data = new Data();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);
        producer.start();
        consumer.start();
    }


}
