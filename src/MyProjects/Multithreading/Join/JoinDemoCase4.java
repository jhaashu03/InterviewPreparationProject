//Case 4: If a thread calls join method on the same thread itself then the program will be stuck
// this is something like deadlock. In this case thread has to wait infinite amount of time.

package MyProjects.Multithreading.Join;

public class JoinDemoCase4 {
    public static void main(String args[]) throws InterruptedException {
        Thread.currentThread().join(); // Deadlock
        System.out.println("Main Thread");
    }
}
