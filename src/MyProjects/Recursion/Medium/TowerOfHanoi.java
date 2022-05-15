package MyProjects.Recursion.Medium;

public class TowerOfHanoi {
    static int count=1;
    public static void  main(String args[])
    {
        int n = 5; // Number of disks
        towerOfHanoi(n, 'S', 'T', 'D'); // A, B and C are names of rods
        System.out.println("Number of steps "+count);
    }

    private static void towerOfHanoi(int n, char s, char t, char d) {
        //moving 1 plate from source to destination
        if(n==1){
            System.out.println("Moving plate "+n+" from "+ s+ " to "+ d);
            return;
        }
        else
        {
            count++;
            //move n-1 plate from source to temp using destination
            towerOfHanoi(n-1,s,d,t);
            System.out.println("Moving plate "+n+" from "+ s+ " to "+ d);
            //move n-1 plate from temp to destination using source
            count++;
            towerOfHanoi(n-1,t,s,d);

        }
    }
}
