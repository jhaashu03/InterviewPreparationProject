package MyProjects.Interview;

import java.util.HashSet;

public class longestUniqueSubString {
    public static void main(String args[]) {
        HashSet<Character> h = new HashSet<>();
        String s= "abcbe";
        int count=0;
        int maxCount = 0;
        int n = s.length();
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                if(h.add(s.charAt(j))){
                    count++;
                }
                else{
                    if(maxCount<count){
                        maxCount=count;
                        break;
                    }
                    count=0;
                }
            }
        }

        //method-2
        /*for(int i =0;i<n;i++){
            int j =i;
            if(h.add(s.charAt(j))){
                count++;
                j++;
            }
            else{
                if(maxCount<count){
                    maxCount=count;
                }
                count =0;
                if(h.remove(s.charAt(i))){
                    i++;
                }

            }

        }*/

        System.out.println(maxCount);
    }
}
