//Lecture-2

package MyProjects.Recursion;


public class Factorial {
    public static void main(String args[]){
        int n = 5;
        System.out.println("Factorial of "+ n + ": " + fact(n));
    }

    private static int fact(int n) {
        if(n==1)
            return 1;
        return n*fact(n-1);
    }
}
