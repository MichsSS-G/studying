package functionalInterfacesAndLamdas;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static Predicate<Object> condition = Objects::isNull;

    public static Function<Object, Integer> ifTrue = obj -> 0;

    public static Function<CharSequence, Integer> ifFalse = CharSequence::length;

    public static <T, R> Function<T, R> ternaryOperator(Predicate<? super T> condition, Function<? super T, ? extends R> ifTrue, Function<? super T, ? extends R> ifFalse) {
        return arg -> condition.test(arg) ? ifTrue.apply(arg) : ifFalse.apply(arg);
    }

//    public static <T, R> Function<T, R> ternaryOperator(Predicate<? super T> condition, Function<? super T, ? extends R> ifTrue, Function<? super T, ? extends R> ifFalse) {
//        return new Function<T, R>() {
//            @Override
//            public R apply(T arg) {
//                return condition.test(arg) ? ifTrue.apply(arg) : ifFalse.apply(arg);
//            }
//        };
//    }

    public static Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

    public static void main(String[] args) {
        String text = null;
        System.out.println(safeStringLength.apply(text));
    }
}
