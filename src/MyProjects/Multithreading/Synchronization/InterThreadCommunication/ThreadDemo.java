package MyProjects.Multithreading.Synchronization.InterThreadCommunication;

public class ThreadDemo {
    public static void main(String args[]) throws InterruptedException {
        myThread t = new myThread();
        t.start();
        //Thread.sleep(1000);  //Main thread will keep on waiting, because notification already sent
        //Thread.sleep(2000);
        //t.join();  // it will wait until 1 crore lines of code excute not recommended
        synchronized (t){
            System.out.println("Main thread trying to call wait() method");
            t.wait();
        }
        System.out.println("Main Thread Recived notification..");
        System.out.println("Total= "+t.total);

    }
}

class myThread extends Thread{
    int total = 0;
    public  void run(){
        synchronized (this){
            System.out.println("Child thread starts calculation");
            for(int i=1;i<=100;i++){
                total+=i;
            }
            System.out.println("Child thread giving notification");
            this.notify();
        }
        //1 crore lines of code
    }
}