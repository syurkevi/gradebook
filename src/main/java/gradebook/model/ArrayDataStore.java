package gradebook.model;
import java.util.ArrayList;

public class ArrayDataStore<T> implements AbstractDataStore<T> {
    private int arraySize;
    private ArrayList<T> store;

    public ArrayDataStore(int defaultArraySize) {
        arraySize = defaultArraySize;
        store = new ArrayList<T>(arraySize);
    }
    public T read(int id) {
        if (id > 0 && id < store.size()) {
            return store.get(id);
        }
        return null;
    }
    public void write(int id, T stored) {
        if (id > 0 && id < store.size()) {
            store.add(id, stored);
        }
    }
}
