package MyProjects.Recursion.Medium;


/*
* Input : ab
Output : AB Ab ab aB*/
public class PermutationWithCaseChange {
    public static void main(String args[]){
        String ip = "ab";
        String op = "";
        permute(ip,op);
    }

    private static void permute(String ip, String op) {
        if(ip.length()==0){
            System.out.print(op+" ");
            return;
        }
        else{
            String op1 = op;
            op1+=ip.charAt(0);

            String op2 = op;
            op2+=ip.toUpperCase().charAt(0);
            ip=ip.toLowerCase().substring(1);

            permute(ip,op1);
            permute(ip,op2);
        }
    }
}
