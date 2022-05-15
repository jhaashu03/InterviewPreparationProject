package MyProjects.Multithreading.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static  void main(String args[]){
        myJobs[] jobs = {new myJobs("A"),
                new myJobs("B"),
                new myJobs("C"),
                new myJobs("D"),
                new myJobs("E")};

        ExecutorService service = Executors.newFixedThreadPool(3);

        for(myJobs job: jobs){
            service.submit(job);
        }
        service.shutdown();
    }

}


class myJobs implements Runnable{
    String name;
    myJobs(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name+" job started by "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+" job completed by "+Thread.currentThread().getName());
    }
}
