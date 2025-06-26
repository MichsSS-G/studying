package practicingStreamAPI;

import java.io.*;
import java.util.*;

public class Find10MostFrequent {



    public static void main(String[] args) throws Exception {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {
            String line;
            StringBuilder current = new StringBuilder();
            Map<String, Integer> count = new HashMap<>();
            Set<String> different = new HashSet<>();
            while ((line = in.readLine()) != null) {
                char[] token = line.toCharArray();
                token = Arrays.copyOf(token, token.length + 1);
                token[token.length - 1] = ' ';
                for (char c : token) {
                    if (Character.isDigit(c) || Character.isLetter(c)) {
                        current.append(c);
                    }
                    else {
                        String tmp = current.toString().toLowerCase();
                        if (tmp.isEmpty()) {
                            continue;
                        }
                        if (different.contains(tmp)) {
                            count.put(tmp, count.get(tmp) + 1);
                        }
                        else {
                            count.put(tmp, 1);
                            different.add(tmp);
                        }
                        current = new StringBuilder();
                    }
                }
            }
            List<String> outputList = new ArrayList<>(different);
            Comparator<? super String> order = (Comparator<String>) (o1, o2) -> {
                Integer cnt1 = count.get(o1);
                Integer cnt2 = count.get(o2);
                if (Objects.equals(cnt1, cnt2)) {
                    return -o1.compareTo(o2);
                }
                return cnt1 - cnt2;
            };
            outputList.sort(order);
            Collections.reverse(outputList);
            for (int i = 0; i < Math.min(10, outputList.size()); ++i) {
                System.out.println(outputList.get(i));
            }
        }
        catch (Exception e) {
            throw new Exception("Cannot open scanner");
        }
    }
}
