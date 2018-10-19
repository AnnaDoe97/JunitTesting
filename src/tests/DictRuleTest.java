package tests;
import com.company.DictRule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;

import java.io.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class DictRuleTest {
    static File temp;

    @BeforeAll
    public void createFile() throws IOException {
        temp = File.createTempFile("dict", "txt");
        PrintWriter writer = new PrintWriter(new FileWriter(temp.toString()));
        writer.println("qwerty");
        writer.close();
    }

    @Test
    public void testDictFile(){
        Assertions.assertThrows(IOException.class, () -> {
            DictRule rule = new DictRule("");
        });
    }

    @Test
    public void testDictRule(){
        DictRule rule = null;
        try {
            rule = new DictRule(temp.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(rule.check("qwerty"));
        Assertions.assertTrue(rule.check("flgkjsdkldkhg"));

    }


    @AfterAll
    public void deleteFile(){
        temp.delete();
    }


}
