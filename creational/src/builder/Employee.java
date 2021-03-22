package builder;

import java.util.Date;

public class Employee {

    private final long id;

    private String summary;

    private String description;

    private boolean done;

    private Date dueDate;

    public Employee(long id) {
        this.id = id;
    }

    public Employee(long id, String summary, String description, boolean done, Date dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public Date getDueDate() {
        return dueDate;
    }
}
