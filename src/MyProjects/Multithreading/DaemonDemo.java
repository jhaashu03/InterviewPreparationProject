package MyProjects.Multithreading;

public class DaemonDemo {
    public static void main(String args[]) {
        System.out.println(Thread.currentThread().isDaemon());
        //Thread.currentThread().setDaemon(true); //java.lang.IllegalThreadStateException
        myThread1 t = new myThread1();
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
}

class myThread1 extends Thread{

}
