/** Реализовать методы: add, top, remove. */
package work4;

import java.util.*;
public class MyQueue {
    LinkedList<String> queue = new LinkedList<>();

    void add(String input) {
        queue.add(input);
    }
     String top() {
        for (String str: queue) {
            if (str != null){
               return str;
            }
        }
        return null;
    }
    String remove() {
        for (int i = 0; i < queue.size(); i++) {
            if (queue.get(i) != null) {
                return queue.remove(i);
            }
        }
        return null;
    }
}
