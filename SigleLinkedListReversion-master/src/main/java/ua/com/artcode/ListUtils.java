package main.java.ua.com.artcode;

public class ListUtils {

    public static A<String> createStringList() {
        A<String> head = new Node<>("A");
        A<String> second = new Node<>("B");
        A<String> third = new Node<>("C");
        A<String> fourth = new Node<>("D");
        A<String> fifth = new Node<>("E");
        A<String> sixth = new Node<>("F");
        A<String> seventh = new Node<>("G");
        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        return head;
    }

    public static <T> A<T> reversion(A<T> head) {
//        todo write your code
        if (head != null && head.getNext() != null){
            A<T> last = head;
            //last.setNext(null);

            A<T> curr = head.getNext();
            curr.setNext(last);

            head = head.getNext().getNext();
            while (head != null){
                if (head.getNext() != null){
                    A<T> temp = head;
                    head.setNext(curr);
                    curr = head;
                    head = temp.getNext();
                } else {
                    head.setNext(curr);
                }
            }
        }

        return head;
    }
}
