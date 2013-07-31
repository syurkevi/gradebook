package gradebook.model;

public abstract class AbstractStoringFactory<T> {
    abstract AbstractDataStore<T> getObjectStore();
    abstract AbstractDataStore<T> getObjectStore(String type);
}
