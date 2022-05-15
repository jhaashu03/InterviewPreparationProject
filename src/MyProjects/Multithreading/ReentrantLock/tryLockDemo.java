package MyProjects.Multithreading.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class tryLockDemo {
    public static void main(String args[]){
        myTryLockThread t1 = new myTryLockThread("A-Thread");
        myTryLockThread t2 = new myTryLockThread("B-Thread");
        myTryLockThread t3 = new myTryLockThread("C-Thread");
        myTryLockThread t4 = new myTryLockThread("D-Thread");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class myTryLockThread extends  Thread{
    myTryLockThread(String name){
        super(name);
    }
    static ReentrantLock l = new ReentrantLock();
    public void run(){
        if(l.tryLock()){
            System.out.println(Thread.currentThread().getName()+" has the lock");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            l.unlock();
        }
        else{
            System.out.println(Thread.currentThread().getName()+" unable to get the lock, now performing alternative operations");
        }

    }
}
