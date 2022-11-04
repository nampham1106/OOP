package list;

public interface EnhancedInterface<E> {
    boolean isEmpty();
    int size();
    E getFirst() throws NoSuchFieldException;
    boolean contains(E item);
    void addFirst(E item);
    E removeFirst();
    void print();

}
