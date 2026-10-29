package week_5;

import java.util.*;

public class q17 {
    public static void main(String[] args) {
        int[] a = {1, 2, 2};

        Map<Integer, Integer> h = new HashMap<>();

        int mode_key = Integer.MAX_VALUE;
        int mode_freq = -1;

        for (int x : a) {
            h.put(x, h.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : h.entrySet()) {

            if (mode_freq < e.getValue()) {
                mode_key = e.getKey();
                mode_freq = e.getValue();
            } else if (mode_freq == e.getValue()) {
                mode_key = Math.min(e.getKey(), mode_key);
            }

        }

        System.out.println(mode_key);
    }
}
