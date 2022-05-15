package MyProjects.Multithreading;

public class InterruptDemo2 {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Main thread starts");
        interruptedMyThread2 t = new interruptedMyThread2();
        t.start();
        t.interrupt();
        System.out.println("End of Main thread");
    }

    static class interruptedMyThread2 extends  Thread{
        public void run(){
            for(int i=0;i<10000;i++){
                System.out.println(i+" ");
            }
            System.out.println("Sleeping for 2 sec...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Intrrupted!!!");
            }
        }
    }
}
