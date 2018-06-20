package com.prog.lessons.Customlinkedlist;

import com.prog.lessons.customlist.CustomList;


import java.util.Iterator;

public class CustomLinkedList<T> implements CustomList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    private class Node<T> {
        T element;
        Node next;
        Node prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    // добавление нового элемента в конец списка
    public boolean add(T t) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(l, t, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        return true;
    }

    T unlink(Node<T> x) {
        // assert x != null;
        final T element = x.element;
        final Node<T> next = x.next;
        final Node<T> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.element = null;
        size--;
        return element;
    }

    Node<T> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }


    public T remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    public T get(int index) {
        checkElementIndex(index);
        return node(index).element;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator iterator() {
        return null;
    }
}