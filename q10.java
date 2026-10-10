public class q10 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }

    private static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] composite = new boolean[n];

        for (long i = 2; i * i < n; i++) {
            if (!composite[(int) i]) {
                for (long j = i * i; j < n; j += i) {
                    composite[(int) j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!composite[i]) {
                count++;
            }
        }
        return count;
    }
}