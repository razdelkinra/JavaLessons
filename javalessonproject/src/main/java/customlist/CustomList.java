package customlist;

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
    void remove(T t);

    /**
     * get item from collection
     */
    T get(int index);

    /**
     * @return size of array
     */
    int size();
}
