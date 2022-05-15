//https://www.youtube.com/watch?v=Yg5a2FxU4Fo&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY&index=12

/*
*                               Output  Input
*                                   ""  "ab"
*   (jb a ko select nhi kiya) ""   "b"        "a"     "b" (jb a ko select kiya)
*                       ""  ""  "b"  ""   "a"  ""  "ab"   ""
* */

package MyProjects.Recursion.Medium;

public class PrintAllSubsequences {
    public static void main(String[] args)
    {
        String ip = "abc";
        String op = "";
        findsubsequences(ip, op);
    }

    private static void findsubsequences(String ip, String op) {
        if(ip.length()==0){
            System.out.print(op+" ");
            return;
        }

        //op1 same hota hai op ka because hum decision mein chatAt(0) ko phle select nhi krte
        String op1 = op;

        //op2 mein hum select krte hai toh op2 hoga op + ip string ka 1st char jo select kiya
        String op2 = op;
        op2+=ip.charAt(0);

        //remove 1st char from input string kyoki usspe decision ho gya hai
        ip = ip.substring(1);

        findsubsequences(ip,op1);
        findsubsequences(ip,op2);
    }
}
