package com.company;

import com.company.Rule;

import java.util.List;

public class SpecialRule implements Rule {

    private List<Character> special;
    private int minAmount = 1;

    public SpecialRule(List<Character> specialCharacters, int minAmount) {
        this.special = specialCharacters;
        this.minAmount = minAmount;
    }

    @Override
    public boolean check(String passvord) {
        int amount = 0;
        for (Character c: passvord.toCharArray()){
            if (special.contains(c)){
                amount += 1;
            }
        }
        if (amount >= minAmount){
            return true;
        }
        return false;
    }
}
