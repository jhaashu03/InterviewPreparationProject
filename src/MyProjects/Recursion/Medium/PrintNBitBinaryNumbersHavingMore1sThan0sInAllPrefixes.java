package MyProjects.Recursion.Medium;

//https://www.geeksforgeeks.org/print-n-bit-binary-numbers-1s-0s-prefixes/

/*Input : n = 2
Output : 11 10

Input : n = 4
Output : 1111 1110 1101 1100 1011 1010
* */
public class PrintNBitBinaryNumbersHavingMore1sThan0sInAllPrefixes {
    public static void main(String args[]){
        int n = 3;
        int one = 0;
        int zero = 0;
        String op = "";
        printBinaryNumber(n,one,zero,op);
    }

    private static void printBinaryNumber(int n, int one, int zero, String op) {
        if(n==0){
            System.out.println(op);
            return;
        }

        String op1=op;
        op1+="1";
        printBinaryNumber(n-1,one+1,zero,op1);

        if(one>zero){
            String op2=op;
            op2+="0";
            printBinaryNumber(n-1,one,zero+1,op2);
        }


    }
}
