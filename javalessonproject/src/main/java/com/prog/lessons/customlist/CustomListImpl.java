package com.prog.lessons.customlist;

import java.util.ArrayList;

/**
 * Implementation CustomList interface
 */
public class CustomListImpl<T> implements CustomList<T> {

   // Object[] array;
    private ArrayList<T> array = new ArrayList<>();

    private int size = 0;

   //private static final Object[] DEFAULTCAPACITY = {};

    @Override
    public void add(T t) {
        //init();
        if (size == array.size()){
            ArrayList<T> newarray = new ArrayList<>(array.size()*2+1);
            for(int i =0; i < array.size(); i++) {
               newarray.add(i , array.get(i));
            }
            array = newarray;
            }
            array.add(size, t);
            size++;
        }

       @Override
    public void remove(T t) {
        // TODO: implements method remove. Make him return boolean value!
        array.remove(t);

    }

    @Override
    public T get(int index) {
        // TODO: implements method get.

       return array.get(index);

    }

    @Override
    public int size() {
        return size;
    }


}
