package local.learning.javalombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    void testConstructionNull() {
        Assertions.assertThrows(NullPointerException.class,()->{
            var member = new Member(null,null);
        });
    }

    @Test
    void testSetterNull() {
        Assertions.assertThrows(NullPointerException.class,()->{
            var member = new Member("100","thor");
            member.setId(null);
        });
    }

    @Test
    void testMethodNull() {
        Assertions.assertThrows(NullPointerException.class,()->{
            var member = new Member("100","thor");
            member.sayHello(null);
        });
    }
}
