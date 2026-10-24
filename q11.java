package week_3;

public class q11 {

    public static int modular_addition(int[] a,int MOD){
        int sum=0;
        for(int x:a){
            sum=(sum+x)%MOD;
        }
        return sum;
    }

    public static void main(String[] args) {
        final int MOD = 1_000_000_007;
        int[] a = {0,0};
        int res=modular_addition(a,MOD);
        System.out.println(res);
    }
}
