import java.util.Date;

public class Task {
    int id;
    String name;
    String description;
    Date notificationDateTime;
    Contact contact;
    TaskState state;
    boolean isImportant;

    void add(String name, String description, Date notificationDateTime, Contact contact, TaskState state, boolean isImportant){
    }

    void edit(int taskId){
    }

    void delete(int taskId){
    }
}
