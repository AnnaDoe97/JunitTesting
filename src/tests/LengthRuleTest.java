package tests;

import com.company.LengthRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthRuleTest {
    @Test
    public void insufficientLength(){
        LengthRule lengthRule = new LengthRule(5);
        assertEquals(false, true);
    }
}
