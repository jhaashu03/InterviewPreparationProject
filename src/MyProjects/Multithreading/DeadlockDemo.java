package MyProjects.Multithreading;

public class DeadlockDemo extends Thread{
    A a = new A();
    B b = new B();
    public static void main(String args[]) {
        DeadlockDemo t = new DeadlockDemo();
        t.m1();
    }
    public void m1(){
        this.start();
        b.d2(a);   // Executed by main thread
    }
    public void run(){
        a.d1(b);  //executed by child thread
    }

}

class A{
    public synchronized  void d1(B b){
        System.out.println("Class A D1 method");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Trying to call B.last method");
        b.last();
    }
    public  synchronized void last(){
        System.out.println("Inside A last method");
    }
}

class B{
    public synchronized  void d2(A a){
        System.out.println("Class B D2 method");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Trying to call A.last method");
        a.last();
    }
    public  synchronized void last(){
        System.out.println("Inside B last method");
    }

}