package com.prog.lessons.customlist;

import java.util.Arrays;

/**
 * Implementation CustomList interface
 */
public class CustomListImpl<T> implements CustomList<T> {

    public static final int INITIAL_CAPASITY = 2;
    Object[] array;

    private int size = 0;

    private static final Object[] DEFAULTCAPACITY = {};


    @Override
    public boolean add(T t) {
        init();
        array[size] = t;
        size++;
        return true;
    }

    private void init() {
        if (array == null) {
            array = new Object[INITIAL_CAPASITY];
        }
        if (size == array.length) {
            int newSize = size * 2;
            Object[] newArrays = new Object[newSize];
            System.arraycopy(array, 0, newArrays, 0, size);
            array = newArrays;
        }
    }

    @Override
    public T remove(int index) {
        if (size == 0) {
            // throw Ill
        }
        T object = get(index);
        //array[index] = null;
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(array, index + 1, array, index,
                    numMoved);
        array[--size] = null;
        return object;
    }

    private void trim() {
        Arrays.copyOf(array, size);
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public int size() {
        return size;
    }


}
