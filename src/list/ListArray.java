package list;

import java.util.NoSuchElementException;

public class ListArray<E> implements ListInterface<E>{
    private int size;
    private int numberOfNodes;
    private E[] arr;


    public ListArray() {
        size = 1000;
        numberOfNodes = 0;
        arr = (E[]) new Object[size];
    }

    @Override
    public void addFist(E item) {
        if (numberOfNodes == size) {
            throw new IndexOutOfBoundsException("insufficient space for add");
        }
        for (int i = numberOfNodes - 1; i >= 0 ; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = item;
        numberOfNodes++;
    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        E current = arr[0];
        for (int i = 0; i < numberOfNodes - 1; i++) {
            arr[i] = arr[i+1];
        }
        numberOfNodes--;
        return current;
    }

    @Override
    public boolean isEmpty() {
        return numberOfNodes == 0;
    }

    @Override
    public boolean isContains(E item) {
        for (int i = 0; i < numberOfNodes; i++) {
            if (arr[i].equals(item)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public E getFirst() throws NoSuchElementException {
        if (numberOfNodes == 0) {
            throw new NoSuchElementException("can't get from an empty list");
        } else {
            return arr[0];
        }
    }

    @Override
    public int size() {
        return numberOfNodes;
    }

    @Override
    public void print() {
        for (int i = 0; i < numberOfNodes; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
