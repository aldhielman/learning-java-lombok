package local.learning.javalombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest {

    @Test
    void testWith() {
        var register1 = new Register("thoriq","123456");
        var register2 = register1.withUsername("rivaldi");

        Assertions.assertEquals(register1.getPassword(),register2.getPassword());
        Assertions.assertNotEquals(register1.getUsername(),register2.getUsername());
    }
}
