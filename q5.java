package week_1;

import java.util.*;

public class q5 {
    static void main(String[] args) {
        Deque<Integer>q = new ArrayDeque<>();
        int n=2468;
        int rem=0;
        while (n>0){
            rem=n%10;
            if(rem%2==0){
                q.addFirst(0);
            }else{
                q.addFirst(rem);
            }
            n=n/10;
        }
        System.out.println(q);

    }
}
