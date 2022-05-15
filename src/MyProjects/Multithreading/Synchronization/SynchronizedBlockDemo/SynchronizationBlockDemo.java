package MyProjects.Multithreading.Synchronization.SynchronizedBlockDemo;

public class SynchronizationBlockDemo {
    public static void main(String args[]){
        Display d =  new Display();
        Display d1 =  new Display();
        Display d2 =  new Display();
        myThread t1 = new myThread(d,"abc");
        myThread t2 = new myThread(d,"xyz");
        myThread t3 = new myThread(d1,"abc"); // irregular output if current object is different
        myThread t4 = new myThread(d2,"xyz"); // but if we use class level lock we will get regular output
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
    public void show(String name) {
        //1 lakh line of codes
        //synchronized (Display.class){}
        int x = 10;
        //synchronized(x){}  //compile time error.
        synchronized (this){
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

        //1 lakh line of codes
    }
}
