import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {0, 1, 2};
        int s = 0;
        int e = a.length-1;
        while (s<=e) {
            int t = a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(a));
        }
    }