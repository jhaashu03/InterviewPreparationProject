package MyProjects.StringAndArray.Array;

public class ReverseAnArrayWithoutAffectingSpecialCharacters {
    public void reverseAnArray(char[] arr, int n) {
        char ch[] = new char[n];
        int l = 0;
        int r = n - 1;
        while (r > l) {
            if (!isAlpha(arr[l]))
                l++;
            else if (!isAlpha(arr[r]))
                r--;
            else {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

        }

        String str = new String(arr);
        System.out.println(str);
    }

    private boolean isAlpha(Character c) {
        return ((c >= 'A' && c <= 'Z') || ('a' <= c && c <= 'z'));
    }
}
