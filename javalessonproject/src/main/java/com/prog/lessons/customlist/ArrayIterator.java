package com.prog.lessons.customlist;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator {
    private int index = 0;
    T[] array;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        return array[index++];
    }


}
