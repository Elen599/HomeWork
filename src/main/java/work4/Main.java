package work4;

public class Main {
    public static void main(String[] args) {
        MyQueue qu = new MyQueue();
        qu.add("апельсин");
        qu.add("банан");
        qu.add("киви");
        qu.add("арбуз");
        qu.add("персик");
        System.out.println("Queue: "  + qu.queue);
        System.out.println("Первым хранится в очереди: "  + qu.top());
        String q = qu.remove();
        System.out.println("Извлечен и возвращен первый элемент из очереди: " + q);
        System.out.println( "Queue без первого элемента: " + qu.queue);


        MyStack sk = new MyStack();
        sk.push("вишня");
        sk.push("смородина");
        sk.push("клубника");
        sk.push("жимолость");
        sk.push("черника");
        System.out.println("\nLinkedList: " + sk.stack);
        System.out.println("Добавлен последний элемент в стеке: " + sk.peek());
        String s = sk.pop();
        System.out.println("Посмотрен и извлечен последний элемент из стека: " + s);
        System.out.println( "LinkedList без последнего элемента: " + sk.stack);
    }
}