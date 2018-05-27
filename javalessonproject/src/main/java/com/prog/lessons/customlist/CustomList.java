package com.prog.lessons.customlist;

/**
 * interface for dynamic array
 */
public interface CustomList<T> {

    /**
     * add new item to collection
     */
    boolean add(T t);

    /**
     * remove item from collection
     */
    T remove(int i);

    /**
     * get item from collection
     */
    T get(int index);

    /**
     * @return size of array
     */
    int size();
}
