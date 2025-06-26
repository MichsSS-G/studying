package practicingStreamAPI;

import java.util.stream.*;
import java.util.*;

public class randomInts {

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> n * n % 10000 / 10);
    }


    public static void main(String[] args) {
        IntStream intStream = pseudoRandomStream(13).limit(15);
        intStream.forEach(System.out::println);
    }
}
