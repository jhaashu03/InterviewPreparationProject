package MyProjects.Multithreading.ThreadLocal;

public class ThreadLocalDemo2 {
    public static void main(String args[]){
        customerThread c1 = new customerThread("Customer Thread-1");
        customerThread c2 = new customerThread("Customer Thread-2");
        customerThread c3 = new customerThread("Customer Thread-3");
        customerThread c4 = new customerThread("Customer Thread-4");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}

class customerThread extends Thread{
    static Integer custId = 0;

    private  static  ThreadLocal tl = new ThreadLocal()
    {
        protected Integer initialValue(){
            return ++custId;
        }
    };
    customerThread(String name){
        super(name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" executing with customer id: "+ tl.get());
    }
}
