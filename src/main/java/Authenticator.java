/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rana
 */
import java.util.HashMap;
import java.util.Map;

public class Authenticator {

    private final Map<String, char[]> cachedIds = new HashMap<>();

    /**
     * Insecure method that returns the actual mutable cached array.
     *
     * @param username
     * @return
     */
    public char[] getMitId(String username) {

        if (!cachedIds.containsKey(username)) {
            cachedIds.put(username, "123456789".toCharArray());
        }

        return cachedIds.get(username);
    }

    /**
     * Secure method that returns an immutable String.
     *
     * @param username
     * @return
     */
    public String getMitIdSecure(String username) {

        if (!cachedIds.containsKey(username)) {
            cachedIds.put(username, "123456789".toCharArray());
        }

        return new String(cachedIds.get(username));
    }
}
