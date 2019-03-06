package com.annamate.ownarraylist;

public class MyLinkedList<E> implements MyList<E> {

    private Node head;
    private Node tail;
    private int size = 0;


    private Node first;
    private E e;

    public MyLinkedList() {
        this.head = null;
        this.tail = this.head;
        this.size = 0;
    }

    private class Node {
        private E value;
        private Node next;
        private Node prev;


        public Node() {
        }

        private Node(E value) {
            this.value = value;
            next = null;
            prev = null;
        }

        private Node(E value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        private E getValue() {
            return value;
        }

        private Node getNode(int index) {
            Node node = head;
            for (int i = 1; i < index; i++) {
                head = head.next;
            }
            return node;
        }
    }

    public void add(E e) {
        if (head == null) {
            this.head = new Node();
            this.head.value = e;
            this.tail = this.head;
            this.tail.next = null; //?
            size++;
        }

        Node node = new Node(e);
        this.tail.next = node;
        this.tail = node;
        this.tail.value = e;
        this.tail.next = null;
        size++;

    }

    public void printList(MyLinkedList list) {
        System.out.println();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void remove(int index) {
        Node node = new Node();
        node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        System.out.println("value: " + node.value);

        node.prev = node.next;
        node.next = node.prev;

        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }


    public E get(int index) {
        Node node;
        node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.getValue();
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(0);

        list.get(3);
        System.out.println((list.get(7)).toString());
        System.out.println("Size: " + list.size());
        list.remove(3);
        System.out.println("Size: " + list.size());


    }

}
