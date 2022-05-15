package MyProjects.Recursion.Medium;

public class GenerateAllBalancedParentheses {
  public static void main(String args[]){
      int n = 3;
      int open = n;
      int close = n;
      String op = "";
      gereneratParentheses(open,close,op);
  }

    private static void gereneratParentheses(int open, int close, String op) {

      if(open==0 && close==0){
          System.out.println(op);
          return;
      }

      //open bracket ka choice humesa hi mil rahi hai
      if(open!=0){
          String op1 = op;
          op1+="(";
          gereneratParentheses(open-1,close,op1);
      }

      //closing bracket tb hi le skte hai jb closing bracket > open bracket
      if(close>open){
          String op2 = op;
          op2+=")";
          gereneratParentheses(open,close-1,op2);
      }
    }
}
