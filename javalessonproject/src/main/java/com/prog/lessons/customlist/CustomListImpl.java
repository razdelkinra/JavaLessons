package com.prog.lessons.customlist;

import java.util.Iterator;

/**
 * Implementation CustomList interface
 */
public class CustomListImpl<T> implements CustomList<T> {
    public static final int DEFAULT_SIZE = 16;

    private T[] array;

    private int size;

    public CustomListImpl() {
        array = (T[]) new Object[DEFAULT_SIZE]; // константы выделяй в статические финальные поля ctrl + alt + c
    }

    @Override
    public boolean add(final T t) {
        if (size == array.length) {
            T[] temp = array;
            array = (T[]) new Object[(this.size() * 2)];
            System.arraycopy(temp, 0, array, 0, temp.length);
        }
        array[size++] = t;
        return true;
    }

    @Override
    public T remove(int index) {

        T temp = array[index];
        int numMoved = size - index - 1;
        System.arraycopy(array, index + 1, array, index, numMoved);
        array[--size] = null;
        return temp;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator<>(array);
    }

    public class ArrayIterator<T> implements Iterator {
        private int index = 0;
        T[] array;

        public ArrayIterator(T[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return index < CustomListImpl.this.size;
        }

        @Override
        public T next() {
            return array[index++];
        }


    }
}
