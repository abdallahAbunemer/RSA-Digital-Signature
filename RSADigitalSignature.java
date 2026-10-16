import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.util.Base64;

public class RSADigitalSignature {

    public static void main(String[] args) {

        try {
            // Generate RSA keys
            KeyPairGenerator gen = KeyPairGenerator.getInstance("RSA");
            gen.initialize(2048);
            KeyPair keys = gen.generateKeyPair();

            System.out.println("RSA keys generated successfully!");

            // Original message
            String msg = "Hello, this is a digital signature test";
            System.out.println("Original message: " + msg);

            // Create digital signature
            Signature sign = Signature.getInstance("SHA256withRSA");
            sign.initSign(keys.getPrivate());
            sign.update(msg.getBytes());

            byte[] signature = sign.sign();

            System.out.println("Digital signature: "
                    + Base64.getEncoder().encodeToString(signature));

            // Verify original message
            Signature verify = Signature.getInstance("SHA256withRSA");
            verify.initVerify(keys.getPublic());
            verify.update(msg.getBytes());

            System.out.println("Original signature valid: "
                    + verify.verify(signature));

            // Test modified message
            String newMsg = "This message has been changed";

            verify.initVerify(keys.getPublic());
            verify.update(newMsg.getBytes());

            System.out.println("Modified message: " + newMsg);
            System.out.println("Modified signature valid: "
                    + verify.verify(signature));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
