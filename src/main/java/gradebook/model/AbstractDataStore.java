package gradebook.model;

public interface AbstractDataStore<T> {
    T read(int id);
    void write(int id, T stored);

}
