package tests;

import com.company.CaseRule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaseRuleTest {
    @Test
    public void testCase(){
        CaseRule rule = new CaseRule(2, 3);
        assertEquals(false, rule.check("aaaaaaa"));
        assertEquals(true, rule.check("AAAaaaAAAAa"));
        
    }
}
