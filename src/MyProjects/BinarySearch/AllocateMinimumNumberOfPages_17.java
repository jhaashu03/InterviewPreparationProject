//https://www.geeksforgeeks.org/allocate-minimum-number-pages/

package MyProjects.BinarySearch;

/*
* Given number of pages in n different books and m students.
* The books are arranged in ascending order of number of pages.
* Every student is assigned to read some consecutive books.
* The task is to assign books in such a way that the maximum number of pages assigned
* to a student is minimum.

Example :

Input : pages[] = {12, 34, 67, 90}
        m = 2
Output : 113
Explanation:
There are 2 number of students. Books can be distributed
in following fashion :
  1) [12] and [34, 67, 90]
      Max number of pages is allocated to student
      2 with 34 + 67 + 90 = 191 pages
  2) [12, 34] and [67, 90]
      Max number of pages is allocated to student
      2 with 67 + 90 = 157 pages
  3) [12, 34, 67] and [90]
      Max number of pages is allocated to student
      1 with 12 + 34 + 67 = 113 pages

Of the 3 cases, Option 3 has the minimum pages = 113.
*
* SOLUTION----------------------------------
*
* So to solve this draw a imaginary number line whose min value will be arr ka max
* and max will be array ka sum
*
* now apply BS with low = max of array and high = sum of array
* So everytime we will have mid element and see if I can devide the array in such a
* way that max number of book a student will read is mid and check if it is possible
* with given number of element if yes than move towards left and try to find
* optinmal sol otherwise move towards left
*
* ex arr= 10,20,30,40
* max=40;sum=100;mid=50
* but 50 number of pages can't be distrubited into 2 studenst we need min 3 students for this.
* So move low to mid+1
*
* Now low is 50 high is 100 => mid is 75
* So one student can read 10+20+30
* and other can read 40
* Thus 75 is one possbile soln
* Now update high as 75 and try to find optinaml
* */

public class AllocateMinimumNumberOfPages_17 {
    public static void main(String[] args)
    {
        //Number of pages in books
        int arr[] = {12, 34, 67, 90};

        int m = 2; //No. of students

        System.out.println("Minimum number of pages = " + findPages(arr, arr.length, m));
    }

    private static int findPages(int[] arr, int length, int m) {
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            sum+=i;
            max = Math.max(i,max);
        }

        if(m>length)
            return -1;

        int res = -1;
        int low = max;
        int high = sum;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(isValid(arr,length,m,mid)){
                res= mid;
                high = mid-1;
            }
            else
                low=mid+1;
        }

        return res;
    }

    private static boolean isValid(int[] arr, int length, int m,int mid) {
        int student = 1;
        int sum=0;
        for(int i=0;i<length;i++){
            sum+=arr[i];
            if(sum>mid){
                student++;
                sum=arr[i];
            }
            if(student>m)
                return false;
        }
        return true;
    }
}
