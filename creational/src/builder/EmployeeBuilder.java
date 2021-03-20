package builder;

import java.util.Date;

public class EmployeeBuilder {

    private final long id;

    private String summary;

    private String description;

    private boolean done;

    private Date dueDate;

    public EmployeeBuilder(long id) {
        this.id = id;
    }

    public EmployeeBuilder(long id, String summary, String description, boolean done, Date dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    public EmployeeBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public EmployeeBuilder setDescription(String description) {
        this.description = description;
        return this;

    }

    public EmployeeBuilder setDone(boolean done) {
        this.done = done;
        return this;
    }

    public EmployeeBuilder setDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;

    }

    public Employee build() {
        return new Employee(id, summary, description, done, dueDate);
    }

}
