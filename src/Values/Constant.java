package Values;

import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Constant {

    public static SecretKeySpec secretKey() {
        MessageDigest sha;
        try {
            byte[] key = "a1h3hfsfav1nsjhueAA!@!@#$!@".getBytes(StandardCharsets.UTF_8);
            sha = MessageDigest.getInstance("SHA-512");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 32);
            return new SecretKeySpec(key, "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Map<String, Integer> attemptCounts = new HashMap<>();

    // EVENT CODES
    public static String USER_LOCKED = "UL";
    public static String USER_UNLOCKED = "UUL";

    public static String EDIT_ROLE_SUCCESSFUL = "ER-S";
    public static String EDIT_ROLE_FAILED = "ER-F";

    public static String CHANGED_PASSWORD_SUCCESSFUL = "CP-S";
    public static String CHANGED_PASSWORD_FAILURE = "CP-F";

    public static String DELETE_USER_SUCCESSFUL = "DU-S";
    public static String DELETE_USER_FAILED = "DU-F";

    public static String LOGIN_SUCCESSFUL = "LO-S";
    public static String LOGIN_FAILED = "LO-F";

    public static String PURCHASE_SUCCESSFUL = "PP-S";
    public static String PURCHASE_FAILED = "PP-F";

    public static String ADD_PRODUCT_SUCCESSFUL = "AP-S";
    public static String ADD_PRODUCT_FAILED = "AP-F";

    public static String REMOVE_PRODUCT_SUCCESSFUL = "RP-S";
    public static String REMOVE_PRODUCT_FAILED = "RP-F";

    public static String EDIT_PRODUCT_SUCCESSFUL = "EP-S";
    public static String EDIT_PRODUCT_FAILED = "EP-F";

    public static String DEBUG_MODE_ON = "DEBUG-M1";
    public static String DEBUG_MODE_OFF = "DEBUG-M0";

    public static boolean managerLockedOut = false;
}
