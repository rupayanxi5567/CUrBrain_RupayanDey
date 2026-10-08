package week_1;

public class q7 {
    public static void main(String[] args) {
        int [] a = {1,7,14,28};
        int res=a[0];
        for(int i=1;i<=a.length-1;i++){
            res=gcd(res,a[i]);
        }
        System.out.println(res);
    }

    private static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
