package com.company;

public class LengthRule implements Rule {
    private int allowableLength = 1;

    public LengthRule(int allowableLength){
        this.allowableLength = allowableLength;
    }

    @Override
    public boolean check(String passvord) {
        return false;
    }
}
