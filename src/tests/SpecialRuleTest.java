package tests;

import com.company.SpecialRule;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialRuleTest {

    @Test
    public void specialTest(){
        List<Character> characters = Arrays.asList('!', '@', '#', '$');
        SpecialRule rule = new SpecialRule(characters, 2);
        assertEquals(false, rule.check("!123"));
        assertEquals(true, rule.check("!!aa"));
        assertEquals(true, rule.check("!@#$aaaaaa"));

    }
}
