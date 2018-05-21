package main.java.customlist;
/**
 * Implementation CustomList interface
 */
public class CustomListImpl<T> implements CustomList<T> {

    Object[] array;

    private int size;

    private static final Object[] DEFAULTCAPACITY = {};

    @Override
    public boolean add(T t) {
        init();
        array[size - 1] = t;
        return true;
    }

    private void init() {
        if (array == null) {
            array = new Object[1];
            size++;
        } else {
            array = new Object[size++];
        }
    }

    @Override
    public void remove(T t) {
        // TODO: implements method remove. Make him return boolean value!
    }

    @Override
    public T get(int index) {
        // TODO: implements method get.
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
