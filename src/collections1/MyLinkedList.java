package collections1;

public class MyLinkedList<E> { // Custom LinkedListimizi yaratdıq.
    // LinkedList LinearSearch ilə işlədiyi üçün element əlavə etməkdə nə silməkdə daha sürətlidir..

    Node<E> head;

    int size =0;

    public void add(E element){
        Node<E> node = new Node<>(element);
        if (head==null){
            head = node;
        }else {
            Node<E> current = head;

            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
        }
        size++;

    }

    public E get(int index){
        if (index < 0 || index>size){
            throw new IndexOutOfBoundsException("index:"+index);
        }

        Node<E> node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    public int size(){
        return size;
    }

    public static class Node<E>{
        E data;
        Node<E> next;


        private Node(E data){
            this.data = data;
            this.next = null;
        }
    }


}
