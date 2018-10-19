package com.company;

import java.util.ArrayList;

public class Validator {
    private ArrayList<Rule> rules;

    public Validator(){
        rules = new ArrayList<>();
    }

    public void registerRule(Rule rule){
        rules.add(rule);
    }

    public boolean validate(String password){

        for (Rule rule: rules){
            if (!rule.check(password)){
                System.out.println("Test Faild"+rule.getClass());
                return false;
            }
        }
        return true;
    }

}
