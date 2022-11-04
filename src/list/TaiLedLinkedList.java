package list;

import java.util.NoSuchElementException;

public class TaiLedLinkedList<E>  implements EnhancedInterface<E> {
    private Node<E> head;
    private Node<E> tail;
    private int numberOfNodes;

    public TaiLedLinkedList() {
        head = null;
        tail = null;
        numberOfNodes = 0;
    }

    public Node<E> getTail() {
        return tail;
    }

    @Override
    public boolean isEmpty() {
        return numberOfNodes == 0;
    }

    @Override
    public int size() {
        return numberOfNodes;
    }

    @Override
    public E getFirst() throws NoSuchFieldException {
        return null;
    }

    @Override
    public boolean contains(E item) {
        return false;
    }

    @Override
    public void addFirst(E item) {
        head = new Node<>(item, head);
        numberOfNodes++;
        if (numberOfNodes == 1) {
            tail = head;
        }
    }

    public void addLast(E item) {
        if (head != null) {
            tail.setNext(new Node<E>(item));
            tail = tail.getNext();
        } else {
            tail = new Node<E>(item);
            head = tail;
        }
        numberOfNodes++;
    }

    public void addAfter(Node<E> current, E item) {
        if (current != null) {
            current.setNext(new Node(item, current.getNext()));
            if (current == tail) {
                tail = current.getNext();
            }
        } else {
            head = new Node<E>(item, head);
            if (tail == null) {
                tail = head;
            }
            numberOfNodes++;
        }
    }

    public E removeAfter(Node<E> current) {
        E tmp;
        if (current != null) {
            Node<E> nextPtr = current.getNext();
            if (nextPtr != null) {
                tmp = nextPtr.getItem();
                current.setNext(nextPtr.getNext());
                numberOfNodes--;
                if (nextPtr.getNext() == null) {
                    tail = current;
                }
                return tmp;
            } else {
                throw new NoSuchElementException("---");
            }
        } else {
            if (head == null) {
                tmp = head.getItem();
                head = head.getNext();
                if (head == null) {
                    tail = null;
                }
                return tmp;
            } else {
                throw new NoSuchElementException("----");
            }
        }
    }

    @Override
    public E removeFirst() {
        return removeAfter(null);
    }

    @Override
    public void print() {

    }
}
