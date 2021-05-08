package geektech.myapplication;

public class Model {
    private String id;
    private String title;
    private String description;
    private long date;

    public Model(String id, String title, String description, long date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public long getDate() {
        return date;
    }
}
