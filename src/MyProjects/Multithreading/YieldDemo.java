package MyProjects.Multithreading;

public class YieldDemo {
    public static void main(String args[]){
        myThread t = new myThread();
        t.start();
        for(int i =0;i<5;i++)
            System.out.println("Main thread");
    }

    static class myThread extends Thread{
        public void run(){
            for(int i =0;i<5;i++){
                System.out.println("Child thread");
                Thread.yield(); //It causes to pass the current executing thread to give the chance for waiting threads of same priority
            }
        }
    }
}
