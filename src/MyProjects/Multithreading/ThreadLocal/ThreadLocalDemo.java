package MyProjects.Multithreading.ThreadLocal;

public class ThreadLocalDemo {
    static public void main(String[] args) {
        ThreadLocal tl = new ThreadLocal(){
            public Object initialValue(){
                return "xyz";
            }
        };
        System.out.println(tl.get());
        tl.set("ABC");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());

    }
}
