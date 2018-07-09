package com.prog.lessons.CustomHashMap;

public interface CustomHashMap<K, V> {

    boolean add(K key, V value);

    boolean delete(K key);

    V get(K key);

    int size();
}
