package list;

import java.util.NoSuchElementException;

public interface ListInterface<E> {
    void addFist(E item);
    E removeFirst() throws NoSuchElementException;
    boolean isEmpty();
    boolean isContains(E item);
    E getFirst() throws NoSuchElementException;
    int size();
    void print();
}
