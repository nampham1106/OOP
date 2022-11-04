package list;

import java.util.NoSuchElementException;

public class LinkedList<E> implements ListInterface<E> {
    class Node<E> {
        private E item;
        private Node<E> next;

        public Node(E item)  {
            this(item, null);
        }

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public E getItem() {
            return item;
        }

        public void setNext(Node<E> node) {
            this.next = node;
        }
    }

    private Node<E> head;
    private int numberOfNodes;

    public LinkedList() {
        head = null;
        numberOfNodes = 0;
    }

    @Override
    public void addFist(E item) {
        head = new Node<E>(item, head);
        numberOfNodes++;
    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        Node<E> node;
        if (head == null) {
            throw new NoSuchElementException("can't remove from empty list");
        } else {
            node = head;
            head = head.getNext();
            numberOfNodes--;
            return node.getItem();
        }
    }

    @Override
    public boolean isEmpty() {
        return numberOfNodes == 0;
    }

    @Override
    public boolean isContains(E item) {
        for (Node<E> node = head; node != null; node = node.getNext()) {
            if (node.getItem().equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("can't get from an empty list");
        }
        return head.getItem();
    }

    @Override
    public int size() {
        return numberOfNodes;
    }

    @Override
    public void print() {
        if (head == null) {
            throw new NoSuchElementException("can't print from empty list");
        }

        for (Node<E> node = head; node != null ; node = node.getNext()) {
            System.out.print(node.getItem() + " ");
        }
    }
}
