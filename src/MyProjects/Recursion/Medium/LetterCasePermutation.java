package MyProjects.Recursion.Medium;

public class LetterCasePermutation {
    public static void main(String args[]){
        String ip = "a1b2";
        String op = "";
        permute(ip,op);
    }

    private static void permute(String ip, String op) {
        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        else{

            if(Character.isAlphabetic(ip.charAt(0))){
                String op1 = op;
                String op2 = op;

                op1+=ip.toLowerCase().charAt(0);
                op2+=ip.toUpperCase().charAt(0);

                ip = ip.substring(1);

                permute(ip,op1);
                permute(ip,op2);
            }
            else{
                String op1 = op;
                op1+=ip.charAt(0);
                ip=ip.substring(1);

                permute(ip,op1);
            }
        }
    }
}
