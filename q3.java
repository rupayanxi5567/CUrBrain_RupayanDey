package week_1;

public class q3 {
    static void main(String[] args) {
        int n=-120;
        int res=helper(n);

        if(n<0){
            int negRev=-res;
            System.out.println(n+negRev);
            return;
        }

        if(res==n){
            System.out.println(n);
        }else{
            System.out.println(res+n);
        }
    }

    private static int  helper(int n) {
        int rev=0,rem=0;
        if(n<0){
            n=n*(-1);
        }
        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}
