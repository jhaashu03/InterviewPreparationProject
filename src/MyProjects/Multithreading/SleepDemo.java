package MyProjects.Multithreading;


public class SleepDemo {
    public static void main(String args[]) throws InterruptedException {
        for(int i=1;i<=5;i++){
            System.out.println("Showing slide "+i);
            Thread.sleep(3000);
        }
        System.out.println("Thank you!!!");
    }
}
