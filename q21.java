package week_6;

import java.util.Arrays;

public class q21 {
    static void main(String[] args) {
        int []a = {5,5,5};
        int x=5;

        helperDeleteByValue(a,x);
        System.out.println(Arrays.toString(a));
    }

    private static void helperDeleteByValue(int[] a, int x) {

        for(int i=0;i<a.length;i++){
            if(x==a[i]){
                int l=i;
                int r=i+1;

                while (r<a.length){
                    a[l] = a[r];
                    l++;
                    r++;
                }
                break;
            }
        }
    }


}
