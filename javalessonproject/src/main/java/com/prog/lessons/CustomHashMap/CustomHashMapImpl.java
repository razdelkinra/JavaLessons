package com.prog.lessons.CustomHashMap;

import java.util.LinkedList;
import java.util.List;

public class CustomHashMapImpl<K, V> implements CustomHashMap<K, V> {

    public static final int DEFAULT_CAPACITY = 16;  // константы выделяй
    private Entry<K, V>[] table;
    private int size = 0; // по умолчанию инициализируется 0. Просто private int size;

    public CustomHashMapImpl() {
        table = new Entry[DEFAULT_CAPACITY];
    }

    // Повтори на листочке без подсматривания, на собеседовании обязательно спросят

    @Override
    public boolean add(K key, V value) {
        Entry<K, V> newEntry = new Entry<>(key, value);
        int index = hash(key);
        // если в ячейке пусто
        if (table[index] == null) {
            table[index] = new Entry<>(null, null);
            table[index].getEntry().add(newEntry);
            size++;
            return true;
        }
        List<Entry<K, V>> entryList = table[index].getEntry();
        for (Entry<K, V> entry : entryList) {
            //если в ячейке(листе) есть нода с таким же ключом, но другим значением, то перезаписываем его
            if (newEntry.getKey().equals(entry.getKey()) &
                    !newEntry.getValue().equals(entry.getValue())) {
                entry.setValue(newEntry.getValue());
                return true;
            }
            // если хэшкоды равны а ноды отличаются друг от друга(коллизия), то добавляем в лист этой ячейки новый элемент
            if (entry.hashCode() == newEntry.hashCode() &&
                    !newEntry.getKey().equals(entry.getKey()) &
                            !newEntry.getValue().equals(entry.getValue())) {
                table[index].getEntry().add(newEntry);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return false;
        }
        if (table[index].getEntry().size() == 1) {
            table[index] = null;
            size--;
            return true;
        }
        List<Entry<K, V>> entryList = table[index].getEntry();
        for (Entry<K, V> entry : entryList) {
            if (key.equals(entry.getKey())) {
                entryList.remove(entry);
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;
        } else {
            List<Entry<K, V>> entryList = table[index].getEntry();
            for (Entry<K, V> entry : entryList) {
                if (entry.getKey().equals(entry.getKey())) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    public int hash(final K key) {
        int hash = 31;
        hash = hash * 17 + key.hashCode();
        return hash % table.length;
    }

    public class Entry<K, V> {
        List<Entry<K, V>> entry;
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            entry = new LinkedList<Entry<K, V>>();
        }

        public List<Entry<K, V>> getEntry() {
            return entry;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}