package MyProjects.Map.WeakHashMap;

public class Temp {
    public String toString() {
        return "temp";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Inside Finalized");
        super.finalize();
    }
}
