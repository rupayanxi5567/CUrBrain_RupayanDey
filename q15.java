package week_4;

public class q15 {
    public static void main(String[] args) {
        int[] a = {7,-7,4};
        System.out.println(min_abs_val(a));
    }

    private static int min_abs_val(int[] a) {
        int min=Integer.MAX_VALUE; //2
        int abs_min=Integer.MAX_VALUE; //2
        for(int x:a){
            if(x<Math.abs(abs_min)){
                min=x;
                abs_min=Math.abs(x);
            }
        }
        return min;
    }
}
