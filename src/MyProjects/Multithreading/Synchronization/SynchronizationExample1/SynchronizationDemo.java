package MyProjects.Multithreading.Synchronization.SynchronizationExample1;

public class SynchronizationDemo {
    public static void main(String args[]){
        Display d = new Display();
        myThread t1 = new myThread(d,"abc");
        myThread t2 = new myThread(d,"xyz");
        t1.start();
        t2.start();
    }
}

class myThread extends Thread {
    Display d;
    String name;
    myThread(Display d, String name){
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.show(name);
    }
}

class Display{
    public synchronized void show(String name) {
        for(int i=0;i<5;i++){
            System.out.print("Good morning: ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}
