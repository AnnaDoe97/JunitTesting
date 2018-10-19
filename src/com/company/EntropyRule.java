package com.company;

import java.util.HashMap;
import java.util.Map;

//import static com.sun.java.util.jar.pack.Histogram.log2;

public class EntropyRule implements Rule {

    private float minEntropy = 1.f;

    public EntropyRule(float minEntropy){
        this.minEntropy = minEntropy;
    }

    public static double entropy(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else
                freq.put(c, 1);
        }

        double e = 0;

        for (Map.Entry<Character, Integer> entry: freq.entrySet()){
            double p = (double) entry.getValue() / s.length();
            e += p * log2(p);
        }
        return e;
    }

    private static double log2(double a){
        return Math.log(a);
    }



    @Override
    public boolean check(String password) {
        if (entropy(password) >= minEntropy){
            return true;
        }
        return false;
    }
}
