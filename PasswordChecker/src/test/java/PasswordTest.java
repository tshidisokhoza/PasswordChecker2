import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void print() {
        Password pass = new Password();
        boolean a = pass.passwordIsValid("@1Wdfgvhjh");
        assertTrue(a);
    }

    @Test
    void prints() {
        Password pass = new Password();
        boolean a = pass.passwordIsOk("@1Wdfgvhjh");
        assertTrue(a);
    }


}