package collections1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("test");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.add("test4");
        myLinkedList.add("test5");
        myLinkedList.add("test6");
        myLinkedList.add("test7");

        for (int i = 0; i < myLinkedList.size() ;i++) {
            System.out.println(myLinkedList.get(i));
        }

        if (myLinkedList.contains(myLinkedList.get(3))){
            System.out.println(myLinkedList.get(3)+": Found!");
        }
    }
}
