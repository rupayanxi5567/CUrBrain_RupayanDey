package week_1;

public class q2 {
    static void main(String[] args) {
        int n=1200;
        int temp=n;
        if(n<0){
            n=-1*n;
        }
        int res = reverse_and_double(n);
        if(temp<0){
            res=-1*res;
        }
        System.out.println(res);
    }

    private static int reverse_and_double(int n) {
        int rem=0;
        int rev=0;
        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev*2;
    }
}
