package MyProjects.Multithreading.ThreadLocal;

public class ThreadLocalDemo3 {
    public static void main(String args[]){
        ParentThread t = new ParentThread();
        t.start();
    }

}

class ParentThread extends Thread{
    public static int var;
    public static ThreadLocal tl = new ThreadLocal();
    public static InheritableThreadLocal itl = new InheritableThreadLocal(){
        public Object childValue(Object p){
            return "CT";
        }
    };
    public void run(){
        itl.set("I.P.T");
        tl.set("P.T");
        var = 10;
        System.out.println("Inheritable Parent Thread value -- "+itl.get()+"Parent Thread value -- "+ tl.get());
        childThread ct = new childThread();
        ct.start();

    }
}

class childThread extends Thread{
    public void run(){
        System.out.println("Child Thread value -- "+ParentThread.tl.get());
        System.out.println("Inheritable Child Thread value -- "+ParentThread.itl.get());
        System.out.println("Static value var -- "+ParentThread.var);
    }
}
