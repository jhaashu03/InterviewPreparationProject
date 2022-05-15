//Lecture-1

package MyProjects.Recursion;

public class Print1ToNAndNTo1 {
    public static void main(String args[]){
        System.out.println("Print 1 to N");
        print1ToN(7);
        System.out.println();
        System.out.println("Print N to 1");
        printNTO1(7);
    }
    private static void print1ToN(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }

        print1ToN(n-1);
        System.out.print(n+" ");
    }

    private static void printNTO1(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        System.out.print(n+" ");
        printNTO1(n-1);

    }
}
