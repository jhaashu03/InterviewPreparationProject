package MyProjects.Multithreading;

public class InterruptDemo {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Main thread starts");
        interruptedMyThread t = new interruptedMyThread();
        t.start();
        t.interrupt();
        System.out.println("End of Main thread");
    }
    static class interruptedMyThread extends Thread{
        public void run(){
            try {
                for(int i =0;i<10;i++) {
                    System.out.println("Child thread");
                    Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Child thread interrupted");
                    //e.printStackTrace();
                }
            }
        }
    }

