package MyProjects.StringAndArray;

import MyProjects.StringAndArray.Array.*;
import MyProjects.StringAndArray.String.AllPossiblePalindroms;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------MyProjects.StringAndArray------------------------");
        System.out.println("Enter a String");
        String str = sc.next();
        ReverseAnArrayWithoutAffectingSpecialCharacters reverseAnArrayWithoutAffectingSpecialCharacters = new ReverseAnArrayWithoutAffectingSpecialCharacters();
        //reverseAnArrayWithoutAffectingSpecialCharacters.reverseAnArray(str.toCharArray(),str.length());

        AllPossiblePalindroms allPossiblePalindroms = new AllPossiblePalindroms();
        allPossiblePalindroms.allPossiblePalindroms(str, str.length());

        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key");
        int key = sc.nextInt();

        TripletsWithSumSmallerThanGivenSum tripletsWithSumSmallerThanGivenSum = new TripletsWithSumSmallerThanGivenSum();
        //tripletsWithSumSmallerThanGivenSum.tripletWithSumSmallerThanGivenSum(arr,key);

        //ConvertAnArrayIntoZigZagFashion convertAnArrayIntoZigZagFashion = new ConvertAnArrayIntoZigZagFashion(arr,n,0);

        LargestSubarrayWithContiguousElements largestSubarrayWithContiguousElements = new LargestSubarrayWithContiguousElements(arr,n);


        //FindSmallestInteger findSmallestInteger = new FindSmallestInteger(arr,n);
        //new SmallestSubArraySum(arr,n,key,Integer.MAX_VALUE);
        //new StringPermutation().permute(str,"");
    }
}
