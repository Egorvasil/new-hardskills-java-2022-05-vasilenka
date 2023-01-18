import at.favre.lib.crypto.bcrypt.BCrypt;

public class Main {
    public static void main(String[] args) {

        BCrypt.Hasher hasher = BCrypt.withDefaults();

        String hash = hasher.hashToString(4, "12345".toCharArray());

        System.out.println(hash);

        BCrypt.Verifyer verifyer = BCrypt.verifyer();

        BCrypt.Result result = verifyer.verify("12345".toCharArray(), hash);

        System.out.println(result.verified);

        // We can see how the transmitted password is encrypted here

    }
}
