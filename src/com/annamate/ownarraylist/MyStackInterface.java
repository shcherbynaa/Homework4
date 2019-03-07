package com.annamate.ownarraylist;

public interface MyStackInterface<E> {
    public void push(E e);

    public void remove(int index);

    public void clear();

    public int size();

    public E peek();

    public E pop();
}
