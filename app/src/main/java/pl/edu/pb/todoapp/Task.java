package pl.edu.pb.todoapp;

import java.util.Date;
import java.util.UUID;

public class Task {

    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    public Task() {
        id = UUID.randomUUID();
        date = new Date();
    }
    public UUID getId() { return id; }
    public String getName() {
        return name;
    }
    public Date getDate() {
        return date;
    }
    public boolean isDone() {
        return done;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setDone(boolean done) {
        this.done = done;
    }

}
