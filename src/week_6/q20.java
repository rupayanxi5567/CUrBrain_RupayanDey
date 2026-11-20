package week_6;

import java.util.Arrays;

public class q20 {
    static void main() {
        int []a = {};

        helper_suffix_sum(a);
        System.out.println(Arrays.toString(a));
    }

    private static void helper_suffix_sum(int[] a) {
        int ss=0;
        int elem=0;

        for(int i=a.length-1; i>=0; i--){
            elem += a[i];
            a[i]=ss;
            ss=elem;
        }
    }
}
