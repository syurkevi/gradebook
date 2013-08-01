package gradebook.model;

/*
 * A Definition of an interface to use with
 * any extensible Data Store object
 */
public interface AbstractDataStore<T> {
    /*
     * @param id id of stored object
     * @return the requested object
     */
    T read(int id);
    /*
     * @param id id of object to store
     * @param stored the object to store
     */
    void write(int id, T stored);

}
