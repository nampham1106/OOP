package list;

import java.util.NoSuchElementException;

public class EnhancedLinkedList<E> implements EnhancedInterface<E> {
    public class Node<E> {
        private E item;
        private Node<E> next;

        public Node(E item){
            this(item, null);
        }
        public Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }


        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head;
    private int numberOfNodes;

    public EnhancedLinkedList() {
        head = null;
        numberOfNodes = 0;
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
        if (head == null) {
            throw new NoSuchFieldException("can't get from empty list");
        } else {
            return head.getItem();
        }
    }

    @Override
    public boolean contains(E item) {
        for (Node<E>  node = head;  node != null ; node = node.getNext()) {
            if (node.getItem().equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addFirst(E item) {
        head = new Node<E>(item, head);
        numberOfNodes++;
    }

    @Override
    public E removeFirst() {
        Node<E> current;
        if (head == null) {
            throw new NoSuchElementException("Can't remove from empty list");
        } else {
            current = head;
            head = head.getNext();
            numberOfNodes--;
            return current.getItem();
        }
    }

    @Override
    public void print() {
        if (head == null) {
            throw new NoSuchElementException("Can't print from empty list");
        } else {
            for (Node<E> node  = head; node != null ; node = node.getNext()) {
                System.out.print(node.getItem() + " ");
            }
        }
    }


    public Node<E> getHead() {
        return head;
    }

    public void addAfter(Node<E> node, E item) {
        if (node != null) {
            node.setNext(new Node<E>(item, node.getNext()));
        } else {
            head = new Node<E>(item, head);
        }
        numberOfNodes++;
    }


    public E removeAfter(Node<E> current) throws NoSuchElementException {
        E tmp;
        if (current != null) {
            Node<E> nextPtr = current.getNext();
            if (nextPtr.getNext() != null) {
                tmp = nextPtr.getItem();
                current.setNext(nextPtr.getNext());
                numberOfNodes--;
                return tmp;
            } else {
                throw new NoSuchElementException("No next node to remove");
            }
        } else {
            if (head != null) {
                tmp = head.getItem();
                head = head.getNext();
                numberOfNodes--;
                return tmp;
            } else {
                throw new NoSuchElementException("No next node to remove");
            }
        }
    }


    public void removeAfter(E item) {
        if (item != null) {
            for (Node<E> node = head; node != null; node = node.getNext()) {
                if (node.getItem().equals(item)) {
                    removeAfter(node);
                }
            }
        } else {
            for (Node<E> node = head; node != null; node = node.getNext()) {
                if (node.getItem() == null) {
                    removeAfter(node);
                }
            }
        }
    }
}
