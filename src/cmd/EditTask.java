package cmd;

public class EditTask implements Command {
    @Override
    public void Execute() {
        System.out.println("Editing the task");
    }
}
