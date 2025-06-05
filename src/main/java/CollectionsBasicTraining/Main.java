package CollectionsBasicTraining;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int idx = 0;
        while (input.hasNextInt()) {
            int token = input.nextInt();
            if ((idx & 1) != 0) {
                list.add(token);
            }
            ++idx;
        }
        input.close();
        Collections.reverse(list);
        for (Integer el : list) {
            System.out.print(el + " " );
        }
        System.out.print(System.lineSeparator());
    }
}
