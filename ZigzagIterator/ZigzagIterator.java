import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class ZigzagIterator {
    private static class Solution {
    
        public int next() {
           
        }

        public boolean hasNext() {
        }
    }

    private static List<Integer> readList(int n, Scanner sc) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        return list;
    }

    private static void printList(List<Integer> list) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Integer x : list) {
            joiner.add(String.valueOf(x));
        }
        System.out.println(joiner.toString());
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int v1len = sc.nextInt();
            int v2len = sc.nextInt();
            List<Integer> v1 = readList(v1len, sc);
            List<Integer> v2 = readList(v2len, sc);
            List<Integer> answer = new ArrayList<>();

            Solution iter = new Solution(v1, v2);
            while (iter.hasNext()) {
                answer.add(iter.next());
            }
            printList(answer);
        }
    }
}
