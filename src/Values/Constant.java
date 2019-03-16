package Values;

import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

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
}
