package MyProjects.Multithreading;

public class ThreadPriority {
    static class myThread extends Thread{
        public void run(){
            System.out.println("Child Thread-1 prority "+Thread.currentThread().getPriority());
            System.out.println("Child Thread-1 name "+Thread.currentThread().getName());
        }
    }

    static class myThread2 extends Thread{
        public void run(){
            System.out.println("Child Thread-2 prority "+Thread.currentThread().getPriority());
            System.out.println("Child Thread-2 name "+Thread.currentThread().getName());
        }
    }

    public static void main(String args[]){
        System.out.println("Default prority of main thread "+Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(7);
        myThread t = new myThread();
        myThread2 t2 = new myThread2();
        t.setPriority(6);
        t2.setPriority(10);
        t.start();
        t2.start();
        System.out.println("Default prority of main thread "+Thread.currentThread().getPriority());
    }
}
