package by.fpmibsu.bielrent.entity;

public class Photo {
    private long id;
    private String path;

    public Photo(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
