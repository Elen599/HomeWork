/** Реализовать методы: push, peek, pop. */
package work4;

import java.util.LinkedList;

public class MyStack {
    LinkedList<String> stack = new LinkedList<>();

    void push(String input) {
        stack.add(input);
    }

    String peek() {
        return stack.getLast();
    }
    String pop() {
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) != null) {
                return stack.removeLast();
            }
        }
        return null;
    }
}
