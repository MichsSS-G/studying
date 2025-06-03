package byteStreams;

import java.io.*;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
//        byte[] inputArr = new byte[] {65, 66, 13, 13, 10, 10, 13, 67, 13, 13};
//        byte[] inputArr = new byte[] {65, 13, 10, 10, 13};
//        InputStream inputStream = new ByteArrayInputStream(inputArr);
//        System.setIn(inputStream);
        int prev;
        int readedByte;
        try {
            prev = System.in.read();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (prev != -1) {
            try {
                readedByte = System.in.read();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (prev != 13 || readedByte != 10) {
                System.out.write(prev);
//                System.out.println(prev);
            }
            prev = readedByte;
        }
        System.out.flush();
    }
}
