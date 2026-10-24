package week_3;

public class q12 {

    public static long modulo_power(long base, long power, long MOD) {
        long result = 1 % MOD;
        base = base % MOD;
        for (long i = 0; i < power; i++) {
            result = (result * base) % MOD;
        }
        return result;
    }

    public static void main(String[] args) {
        long base=3;
        long pow=4;
        long mod=1;

        System.out.println(modulo_power(base,pow,mod));
    }
}
