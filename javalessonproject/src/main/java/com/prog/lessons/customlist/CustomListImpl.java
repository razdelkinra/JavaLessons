package com.prog.lessons.customlist;

import java.util.Iterator;

/**
 * Implementation CustomList interface
 */
public class CustomListImpl<T> implements CustomList<T> {

    // Object[] array = new Object[0]; !!! array = ( T[] )new Object[0] + конструктор ; ЧЕМ ОТЛИЧАЮТСЯ? get(index) не принимал в первом случае

    private T[] array;

    private int size;

    public CustomListImpl() {
        array = (T[]) new Object[16];
    }

    private static final Object[] DEFAULT_CAPACITY = {};

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
        System.arraycopy(array, index + 1, array, index, numMoved); // Слишком медленно будет работать
        array[--size] = null;
        return temp;

    }



    @Override
    public T get(int index)
    {
        return array[index]; // верно
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator<>(array);
    }
}
