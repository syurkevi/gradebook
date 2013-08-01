package gradebook.model;

/**
 * A specific implementation of a data store
 * using an array as the backing data structure,
 * mainly for testing
 * @param <T> type of object being stored
 */
public class ArrayDataStore<T> implements AbstractDataStore<T> {
    private int arraySize;
    private T[] store;

    public ArrayDataStore(int defaultArraySize) {
        arraySize = defaultArraySize;
        store = (T[]) new Object[arraySize];
    }
    public T read(int id) {
        if (id > 0 && id < arraySize) {
            return store[id];
        }
        return null;
    }
    public void write(int id, T stored) {
        if (id > 0 && id < arraySize) {
            store[id] = stored;
        }
    }
    public int backingArraySize() {
        return arraySize;
    }
}
