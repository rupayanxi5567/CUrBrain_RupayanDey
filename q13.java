package week_3;

public class q13 {
    public static void main(String[] args) {
    int []a = {4,2,9};
        int k = 3;

        System.out.println(prefix_modulo(a,k));
    }

    private static boolean prefix_modulo(int[] a, int k) {
        int p_sum=0; //1,2,4 ; 5
        k=Math.abs(k);
        for(int x:a){
            p_sum+=x;
            if(p_sum%k==0){
                return true;
            }
        }
        return false;
    }
}
