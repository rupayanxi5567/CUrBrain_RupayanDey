package week_4;

public class q16 {

    public static int second_highest(int[] scores) {
        int first = -1;   // -1 mane ekhono set hoyni
        int second = -1;

        for (int x : scores) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x < first && x > second) {
                second = x;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int []a={50, 40, 50, 30};
        System.out.println(second_highest(a));
    }
}