package week_1;
public class q4 {
    static void main(String[] args) {
        int n=2;
        int res = helper(n);
        System.out.println(res);
    }

    private static int helper(int n) {
        if(n<=9){
            return 0;
        }
        int sum=0;
        int prod=1;
        while (n>0){
            sum+=n%10;
            prod*=n%10;
            n=n/10;
        }
        return prod-sum;
    }
}
