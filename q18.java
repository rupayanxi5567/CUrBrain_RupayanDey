package week_5;

import java.util.*;

public class q18 {
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60};

        int l=1;
        int r=4;

        reverse_sub_segment(a,l,r);

        System.out.println(Arrays.toString(a));
    }

    private static void reverse_sub_segment(int[] a, int l, int r) {

        while (l<r){
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;

            l++;
            r--;
        }
    }
}
