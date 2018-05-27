package com.prog.lessons.customlist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Implementation CustomList interface
 */
public class CustomListImpl<T> implements CustomList<T> {

   // Object[] array = new Object[0]; !!! array = ( T[] )new Object[0] + конструктор ; ЧЕМ ОТЛИЧАЮТСЯ? get(index) не принимал в первом случае

    private T[] array;

    public CustomListImpl() {
        array = ( T[] )new Object[0];
    }

    private static final Object[] DEFAULT_CAPACITY = {};

    @Override
    public void add(T t) {
        Object[] temp = array;
        array = (T[]) new Object[temp.length + 1];
        System.arraycopy(temp, 0, array, 0, temp.length);
        array[array.length-1]= t;
    }


    @Override
    public void remove(int index) {
        // TODO: implements method remove. Make him return boolean value!
        // булин будет если идет удаление по значению.

        Object[] temp = array;
        array = (T[]) new Object[temp.length -1];
        System.arraycopy(temp, 0, array, 0, index);
        int numMoved = array.length - index - 1;
        System.arraycopy(temp, index+1, array, index, numMoved);

    }

    @Override
    public T get(int index) {
        // TODO: implements method get.

        return array[index];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator<>(array);
    }
}
