//Case-1: Main thread is waiting for child thread completion

package MyProjects.Multithreading.Join;

public class JoinDemoCase1 {

    static class myThread extends Thread{
        public void run(){
            for(int i =0;i<5;i++) {
                System.out.println("Child thread");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {
        myThread t = new myThread();
        t.start();
        //t.join(); //without time period-main thread will wait until myThread completes it's execution
        t.join(5000); //main thread waited for 5 milli sec
        for(int i =0;i<5;i++)
            System.out.println("Main thread");
    }
}
