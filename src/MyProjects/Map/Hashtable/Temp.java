package MyProjects.Map.Hashtable;

public class Temp {
    int i;

    Temp(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
        //return i%9;  //it will change the output
    }

    public String toString() {
        return i + "";
    }
}
