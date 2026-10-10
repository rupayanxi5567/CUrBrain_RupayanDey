public class q9 {
    public static void main(String[] args) {
        int n = 56;
        System.out.println(nextPrime(n));
    }

    private static int nextPrime(int n) {
        int candidate = n + 1;
        while (!isPrime(candidate)) {
            candidate++;
        }
        return candidate;
    }

    private static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}