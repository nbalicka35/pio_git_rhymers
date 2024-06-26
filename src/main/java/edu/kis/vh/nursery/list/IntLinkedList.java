package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_VALUE = -1;
    private Node last;
    private int i;
    // TODO: 'i' field needs to be deleted, it's never used
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }
    public boolean isEmpty() {
        return last == null;
    }
    public boolean isFull() {
        return false;
    }
    // TODO: method unused, needs proper implementation

    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return last.getValue();
    }
    public int pop() {
        if (isEmpty())
            return EMPTY_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
