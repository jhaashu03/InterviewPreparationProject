package MyProjects.Interview;


import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args)
    {
        String expr = "[(])";
        String expr2 = "[()]{}{[()()]()}";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

        //Calling method-2
        if (areBracketsBalanced2(expr2))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

    private static boolean areBracketsBalanced(String expr) {
        Stack s = new Stack();
        for(int i =0;i<expr.length();i++){
            char c = expr.charAt(i);
            if(c=='('||c=='['||c=='{'){
                s.push(c);
                continue;
            }
            if(s.isEmpty())
                return false;
            char check;
            switch (c){
                case ')': check=(char) s.pop();
                    if(check=='['||check=='{')
                        return false;
                    break;
                case ']': check=(char) s.pop();
                    if(check=='{'||check=='(')
                        return false;
                    break;
                case '}': check=(char) s.pop();
                    if(check=='['||check=='(')
                        return false;
                    break;
                    default:return false;
            }
        }
        return s.isEmpty();
    }

    //Method-2
    public static boolean areBracketsBalanced2(String expr){
        if(expr.contains("()") || expr.contains("[]") || expr.contains("{}")){
            expr = expr.replace("()","");
            expr = expr.replace("[]","");
            expr = expr.replace("{}","");
        }
        return expr.isEmpty();
    }
}
