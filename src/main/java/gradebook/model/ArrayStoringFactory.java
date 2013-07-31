package gradebook.model;

public class ArrayStoringFactory<T> extends AbstractStoringFactory<T> {
    private final int defaultArrayStoreSize = 10;
    private final int defaultSmallSize = 2;
    private final int defaultLargeSize = 1000;

    public AbstractDataStore<T> getObjectStore() {
        return new ArrayDataStore<T>(defaultArrayStoreSize);
    }
    public AbstractDataStore<T> getObjectStore(String type) {
        if (type.equals("small")) {
            return new ArrayDataStore<T>(defaultSmallSize);
        }
        if (type.equals("large")) {
            return new ArrayDataStore<T>(defaultLargeSize);
        }
        return getObjectStore();
    }

}
