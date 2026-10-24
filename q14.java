package week_4;

import java.util.ArrayList;
import java.util.List;

public class q14 {
    public static void main() {
        int[] sales={150,80,200,90,300};
        int threshold=100;

        List<Integer>res=new ArrayList<>();

        threshold_filter(sales,threshold,res);

        System.out.println(res);
    }

    private static void threshold_filter(int[] sales, int threshold, List<Integer> res) {
        for (int x:sales){
            if(x>=threshold){
                res.add(x);
            }
        }
    }
}
