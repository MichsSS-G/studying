package CollectionsBasicTraining;

import javax.lang.model.element.Element;
import java.util.*;

public class SetSymmetricDifference {

    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>();
        for (T element : set1) {
            if (!set2.contains(element)) {
                result.add(element);
            }
        }
        for (T element : set2) {
            if (!set1.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1, 1, 2, 3);
        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2, 0, 1, 2);
        for (Integer el : symmetricDifference(set1, set2)) {
            System.out.println(el);
        }
    }
}
