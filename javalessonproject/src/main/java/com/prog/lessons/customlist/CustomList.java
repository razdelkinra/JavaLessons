package com.prog.lessons.customlist;

/**
 * interface for dynamic array
 */
public interface CustomList<T> extends Iterable {

    /**
     * add new item to collection
     */
    boolean add(T t);

    /**
     * remove item from collection
     */
    T remove(int index);

    /**
     * get item from collection
     */
    T get(int index);

    /**
     * @return size of array
     */
    int size();


}
