package tests;

import com.company.CaseRule;
import com.company.SpecialRule;
import com.company.LengthRule;
import com.company.Validator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    public static Validator validator;

    @BeforeAll
    public static void  initialiseValidator(){
        validator = new Validator();
        List<Character> characters = Arrays.asList('!', '@', '#', '$');
//        validator.registerRule(new LengthRule(10));
        validator.registerRule(new SpecialRule(characters, 2));
        validator.registerRule(new CaseRule(2, 3));
    }

    @Test
    public void simpleTest(){
        assertEquals(false, validator.validate("qwerty"));
    }

    @Test
    public void strongTest(){
        assertEquals(true, validator.validate("rhSDGHckru@#eroe"));
    }

}

