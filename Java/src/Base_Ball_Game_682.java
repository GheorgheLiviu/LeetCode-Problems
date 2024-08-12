import java.util.ArrayDeque;
import java.util.Deque;

public class Base_Ball_Game_682 {
    class Solution {
        public int calPoints(String[] operations) {
            int result = 0;
            Deque<Integer> queue = new ArrayDeque<>();
            for (String s : operations) {
                switch (s) {
                    case "+": {
                        if (queue.size() == 0 || queue.size() == 1) {
                            break;
                        } else {
                            int sum = queue.peekFirst();
                            Integer element = queue.removeFirst();
                            sum += queue.peekFirst();
                            queue.addFirst(element);
                            result += sum;
                            queue.addFirst(sum);
                        }
                        break;
                    }
                    case "D": {
                        if (queue.isEmpty()) {
                            break;
                        } else {
                            int prod = queue.peekFirst() * 2;
                            result += prod;
                            queue.addFirst(prod);
                        }
                        break;
                    }
                    case "C": {
                        if (queue.isEmpty()) {
                            break;
                        } else {
                            int element = queue.removeFirst();
                            result -= element;
                        }
                        break;
                    }
                    default: {
                        Integer element = Integer.parseInt(s);
                        queue.addFirst(element);
                        result += element;
                    }
                }
            }
            return result;
        }
    }
}
