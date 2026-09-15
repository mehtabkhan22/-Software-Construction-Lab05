/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rana
 */
public class AuthenticatorTest {

    // Demonstrates the problem with returning a mutable char[].
    @Test
    public void testMutableCharArrayCorruptsCachedId() {

        Authenticator authenticator = new Authenticator();

        char[] id = authenticator.getMitId("Mehtab");

        // Client modifies the first five digits.
        for (int i = 0; i < 5; i++) {
            id[i] = '*';
        }

        // The cached ID has unintentionally been changed.
        assertEquals(
                "*****6789",
                new String(authenticator.getMitId("Mehtab"))
        );
    }

    // Demonstrates the safer immutable String return type.
    @Test
    public void testSecureStringReturn() {

        Authenticator authenticator = new Authenticator();

        String id = authenticator.getMitIdSecure("Mehtab");

        assertEquals("123456789", id);

        // String cannot be modified directly.
        String modifiedId = id.replace("12345", "*****");

        assertEquals("123456789", id);
        assertEquals("*****6789", modifiedId);
    }
}
