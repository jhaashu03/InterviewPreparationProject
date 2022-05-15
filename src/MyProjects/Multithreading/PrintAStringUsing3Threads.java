package MyProjects.Multithreading;

public class PrintAStringUsing3Threads {
    public  static void main(String args[]){

        myThreadTest t1 = new myThreadTest(1,"Good");
        myThreadTest t2 = new myThreadTest(2,"Morning");
        myThreadTest t3 = new myThreadTest(3,"Ashutosh");

        t1.start();
        t2.start();
        t3.start();
    }



}

class myThreadTest extends Thread{
    static int threadIdToRun = 1;
    int threadId;
    int count =1;
    String name="";
    static Object lock = new Object();

    myThreadTest(int num , String name){
        threadId = num;
        this.name = name;
    }

    public void run(){
        while(count<10){
            synchronized (lock){
                if(threadId != threadIdToRun) {
                    try {
                        lock.wait();
                        System.out.println(Thread.currentThread().getName()+" is waiting");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName()+"---"+name+" ");
                    count++;
                    lock.notifyAll();
                    if (threadId == 1)
                        threadIdToRun = 2;
                    else if (threadId == 2)
                        threadIdToRun = 3;
                    else if (threadId == 3)
                        threadIdToRun = 1;
                }
            }
        }
    }
}
