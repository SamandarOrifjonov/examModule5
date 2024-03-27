package exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;

public class Encoding {
    public static void main(String[] args) throws Exception {

        FileInputStream in = new FileInputStream("text.txt");
        FileOutputStream outputStream = new FileOutputStream("encoded.txt");

        byte[] bytes = in.readAllBytes();
        outputStream.write(encoding(bytes));
        outputStream.flush();

        in.close();
        outputStream.close();
    }

    private static byte[] encoding(byte[] bytes) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encodedBytes = encoder.encode(bytes);
        return encodedBytes;
    }
}
