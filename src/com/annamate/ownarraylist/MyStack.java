package com.annamate.ownarraylist;

import java.lang.reflect.Array;

public class MyStack<E> implements MyStackInterface<E> {

    MyStack<E>[] stack = new MyStack<>();
    E[] arr = (E[])new Object()[10];
    private int size = 0;
    private Object E;

    public void printStack(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public void push(E e){
       arr[arr.length] = e;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E pop() {
        return null;
    }

    public static void main(String[] args) {
        System.out.println("test");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(3);
        stack.push(4);

        stack.printStack();

    }

}
