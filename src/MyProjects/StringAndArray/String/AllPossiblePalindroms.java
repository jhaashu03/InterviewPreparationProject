package MyProjects.StringAndArray.String;

public class AllPossiblePalindroms {
    public void allPossiblePalindroms(String str, int n) {
        System.out.println("All possible palindromic partitions for " + str);
        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        for (int i = 0; i <= n; i++) {
            for (int j = i + 2; j <= n; j++) {
                if (isPalindrom(str.substring(i, j))) {
                    if (j == n - 1)
                        System.out.println(str.substring(0, i) + " " + str.substring(i, j) + " " + str.charAt(j));
                    else {
                        System.out.println(str.substring(0, i) + " " + str.substring(i, j) + " " + str.substring(j, n));
                    }


                }
            }
        }

    }

    private boolean isPalindrom(String substring) {
        StringBuilder str = new StringBuilder(substring);
        str.reverse();
        String s = str.toString().toLowerCase();
        return s.equals(substring);
    }
}
