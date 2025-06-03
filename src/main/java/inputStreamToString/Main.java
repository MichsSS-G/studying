package inputStreamToString;


import java.io.*;
import java.nio.*;
import java.nio.charset.*;

public class Main {

    public static void main(String[] args) {
        byte[] arr = new byte[] {97, 107, 13, 10, 98};
        InputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        try {
            System.out.println(readAsString(byteArrayInputStream, StandardCharsets.UTF_8));
        }
        catch (IOException e) {
            throw new RuntimeException("Cannot read as String");
        }
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder res = new StringBuilder();
        try (Reader reader = new InputStreamReader(inputStream, charset); BufferedReader bufferedReader = new BufferedReader(reader)) {
            int currentByte = reader.read();
            while (currentByte != -1) {
                res.append((char) currentByte);
                currentByte = reader.read();
            }
        }
        catch (IOException e) {
            throw new IOException("Cannot create BufferedReader or InputStreamReader");
        }
        return res.toString();
    }
}
