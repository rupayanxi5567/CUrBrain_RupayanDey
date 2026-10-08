package week_1;

public class q6 {
    static void main(String[] args) {
        int n=0;
        int a=0;
        int b=5;

        int res = helper(n,a,b);
        System.out.println(res);

    }

    private static int helper(int n, int a, int b) {
        if(n==0 && a==0 && b==0){
            return 0;
        }else if(n==0 && (a==0||b==0)){
            return 1;
        }
        int count_a=0;
        int count_b=0;
        while (n>0){
            if(n%10==a){
                count_a++;
            }else if(n%10==b){
                count_b++;
            }
            n=n/10;
        }
        return Math.abs(count_a-count_b);
    }
}
