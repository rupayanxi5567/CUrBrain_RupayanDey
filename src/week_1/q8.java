package week_1;

import java.util.ArrayList;
import java.util.List;

public class q8 {
    public static void main(String[] args) {
        int n=12;
        int k=6;
        List<Integer>res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                res.add(i);
            }
        }
        if(res.size()<k){
            System.out.println(-1);
            return;
        }
        System.out.println(res.get(k-1));
    }
}
