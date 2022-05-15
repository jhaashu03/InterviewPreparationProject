package MyProjects.Multithreading.ThreadPool.Callable;

import java.util.concurrent.*;

public class callableDemo {
    public  static  void main(String args[]) throws Exception{
        myCallableClass[] jobs = {new myCallableClass(10),
                new myCallableClass(20),new myCallableClass(30),
                new myCallableClass(40),new myCallableClass(50)};

        ExecutorService service = Executors.newFixedThreadPool(3);

        for(myCallableClass job: jobs){
            Future r = service.submit(job);
            System.out.println(r.get());
        }

    }
}

class myCallableClass implements Callable{
    int num;
    myCallableClass(int num){
        this.num = num;
    }
    public Object call() throws  Exception{
        int sum =0;
        System.out.println("Sum of first "+ num+ " numbers "+ "performed by "+ Thread.currentThread().getName());
        for(int i=0;i<num;i++){
            sum+=i;
        }
        return sum;
    }
}
