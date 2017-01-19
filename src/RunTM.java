import journal.*;
import ui.*;

public class RunTM {

    public RunTM() {

        TaskJournal model = new TaskJournal();
        Display view = new Display();
        UserInterface controller = new UserInterface();

        model.registerObserver(view);
        model.addController(controller);
        model.addView(view);

        view.addController(controller);
        view.addModel(model);

        controller.addModel(model);
        controller.addView(view);
        controller.registerObserver(model);

        view.ShowMainMenu();
        controller.ReadCommand();

    }
}
