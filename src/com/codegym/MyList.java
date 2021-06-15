package com.codegym;

import java.util.Arrays;

public class MyList<E> {
    //tao 1 class list voi cac thuoc tinh co ban
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //cai dat phuong thuc
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // cai dat phuong thuc add()
    void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    //cai dat phuong thuc get()
    public E get(int i) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException("index: " + i + ", size " + i);
        }
        return (E) elements[i];
    }


}
