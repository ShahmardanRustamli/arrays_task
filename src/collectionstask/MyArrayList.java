package collectionstask;

import generics.Pair;

import java.util.Arrays;

public class MyArrayList<E> {  // Custom ArrayListimizi yaratdıq.
    // ArrayList BinarySearch algoritmi ilə işlədiyi üçün elemntləri tapmadqa sürətlidir..
    private Object[] array;
    private int length;
    private int capacity;
    private static final int INITIAL_CAPACITY=10;

    public MyArrayList(int initialCapacity){
        this.capacity = initialCapacity;
        array = new Object[capacity];
    }

    public MyArrayList(){
        this.capacity = INITIAL_CAPACITY;
        array = new Object[capacity];
    }

    public void add(E element){
        if (length==capacity){
            growSize();
        }
        array[length++] = element;


    }
    private void growSize() {
        array =  Arrays.copyOf(array, array.length+1);

        }
        
        public E get(int index){
        checkCapacity(index);
        return (E)array[index];
        }

    private void checkCapacity(int index) {
        if (index>=length){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void remove(int index){
        checkCapacity(index);
        Object[] tempArray = array;
        array = new Object[length-1];

        for (int i = 0; i < tempArray.length; i++) {
            if (i<index){
                array[i]=tempArray[i];
            }else {
                array[i]= tempArray[i+1];
            }
        }
    }
    public void printList(){
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);
            if (i<=length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
