package gradebook.model;

/**
 *A factory that will allow for easy creation of Data Stores
 *@param <T> type of obect to generate store for
 */
public abstract class AbstractStoringFactory<T> {
    public abstract AbstractDataStore<T> getObjectStore();
    public abstract AbstractDataStore<T> getObjectStore(String type);
}
