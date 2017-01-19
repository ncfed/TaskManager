package task;

import java.util.Date;

public class Task {

    public int id = 0;
    public String name;
    public String description;
    public Date notificationDateTime;
    //Contact contact;
    //TaskState state;
    public boolean isImportant;

    public Task(int id, String name, String description, boolean isImportant) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.isImportant = isImportant;

    }

}
