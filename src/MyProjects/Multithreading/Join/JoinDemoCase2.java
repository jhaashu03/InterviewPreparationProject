//Case-2: Child thread is waiting for main thread completion

package MyProjects.Multithreading.Join;

public class JoinDemoCase2 {

    static Thread mt;
    static class myThread extends Thread {
        public void run(){
            try {
                mt.join();  // Child thread calls join on main thread hence child thread will wait until main thread completion
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i =0;i<5;i++) {
                System.out.println("Child thread");
            }

        }
    }

    public static void main(String args[]) {
        mt= Thread.currentThread();
        myThread t = new myThread();
        t.start();
        //t.join() // Case 3: If both calls join method on each other it will create deadlock situation
        for(int i =0;i<5;i++){
            try {
                System.out.println("Main thread");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
