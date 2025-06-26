package practicingStreamAPI;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class findMinMaxDemo {

    public static <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order, BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        }
        else {
            list.sort(order);
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        }
    }

    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.iterate(25, n -> n * n % 10000 / 10).limit(15);
        intStream.forEach(System.out::println);
        intStream = Stream.iterate(25, n -> n * n % 10000 / 10).limit(15);
        Comparator<Integer> order = (o1, o2) -> (Integer) o1 - (Integer) o2;
        BiConsumer<Integer, Integer> minMaxConsumer = (integer, integer2) -> System.out.println(integer + " " + integer2);
        findMinMax(intStream, order, minMaxConsumer);
    }
}
