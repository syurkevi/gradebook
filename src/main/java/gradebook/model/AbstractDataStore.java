package gradebook.model;

/**
 * A Definition of an interface to use with
 * any extensible Data Store object
 * @param <T> object to be held in specific store
 */
public interface AbstractDataStore<T> {
    /**
     * @param id id of stored object
     * @return the requested object
     */
    T read(int id);
    /**
     * @param id id of object to store
     * @param stored the object to store
     */
    void write(int id, T stored);

}
