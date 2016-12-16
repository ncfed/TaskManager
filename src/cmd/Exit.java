package cmd;

public class Exit implements Command {
    @Override
    public void Execute() {
        System.out.println("Exit the program");
        System.exit(0);
    }
}
