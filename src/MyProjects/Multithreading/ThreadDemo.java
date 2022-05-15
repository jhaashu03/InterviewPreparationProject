package MyProjects.Multithreading;

public class ThreadDemo {
    public static void main(String args[]){
        System.out.println(Thread.currentThread().getName());
        myThread t = new myThread();               //thread instantiation
        t.start();                               //start of a thread
        for(int i =0;i<2;i++)                  //executed by main thread
            System.out.println("Main Thread");

        Runnable r = ()->{
            System.out.println(Thread.currentThread().getName());
            for(int i =0;i<10;i++)                      //Executed by child thread and the program under
            System.out.println("Runnable child Thread");
        };
        Thread t1 = new Thread(r);
        //System.out.println(t1.getName());
        //t1.start();
    }

}
class myThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i =0;i<2;i++)                      //Executed by child thread and the program under
            System.out.println("Child Thread");     //run method is the job of the thread
    }
}
