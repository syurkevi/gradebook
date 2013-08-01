package gradebook.model;

/*
 *A factory that will allow for easy creation of Data Stores
 */
public abstract class AbstractStoringFactory<T> {
    abstract AbstractDataStore<T> getObjectStore();
    abstract AbstractDataStore<T> getObjectStore(String type);
}
