package MyProjects.Multithreading.Synchronization.InterThreadCommunication.ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    public static void main(String args[]){
        Q q= new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.start();
        c.start();
    }

}

class Q{
    int num;
    Queue<Integer> queue = new LinkedList<>();
    boolean valueSet = false;

    public synchronized void put(int num) throws InterruptedException {

        //if I put the value wait for consumer to consume don't put again
        while(valueSet){
            wait();
        }
        this.num = num;
        System.out.println("Put: " +num);
        valueSet = true;
        notify();
    }

    public synchronized void get() throws InterruptedException {
        while (!valueSet){
            wait();
        }
        System.out.println("Get: "+num);
        valueSet = false;
        notify();

    }

}

class Producer extends Thread{
    int i=0;
    Q q;
    Producer(Q q){
        this.q = q;
    }
    public void run(){
        while (true){
            try {
                q.put(i++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Consumer extends Thread{
    Q q;

    Consumer(Q q){
        this.q = q;
    }

    public  void run(){
        while(true){
            try {
                q.get();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
