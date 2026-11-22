package week_6;

import java.util.Arrays;

public class q19 {
    static void main(String[] args) {
        int [] a = {1,2};
        int k=5;

        k=k%a.length;
        int l=0;
        int r=a.length-1;
        int m=k-1;
        int n=k;

        rotates(l,r,m,n,a);
        System.out.println(Arrays.toString(a));
    }

    private static void rotates(int l, int r, int m, int n, int[] a) {
        reverses(l,r,a);
        reverses(l,m,a);
        reverses(n,r,a);
    }

    private static void reverses(int l, int r, int[] a) {
        while (l<r){
            int x = a[l];
            a[l]=a[r];
            a[r]=x;
            l++;
            r--;
        }
    }
}
