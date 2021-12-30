package pojo;

public class Entries {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Runs getRuns() {
        return runs;
    }

    public void setRuns(Runs runs) {
        this.runs = runs;
    }

    private String id, description, name;
    private Runs runs;
}
