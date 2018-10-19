package com.company;

public class CaseRule implements Rule {

    private int minLower = 1;
    private int minUpper = 1;

    public CaseRule(int lowerAmount, int upperAmount){
        this.minLower = lowerAmount;
        this.minUpper = upperAmount;
    }

    public boolean check(String password){
        int lowers = 0;
        int uppers = 0;
        for (Character c: password.toCharArray()){
            if (Character.isAlphabetic(c)){
                if (Character.isUpperCase(c)){
                    uppers += 1;
                }
                else
                    lowers += 1;
            }
        }
        if ((lowers >= minLower) && (uppers >= minUpper))
            return true;

        return false;
    }
}
