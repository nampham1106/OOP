package lab12.factory.abstractfactory.excercise1.app;

import lab12.factory.abstractfactory.excercise1.buttons.Button;
import lab12.factory.abstractfactory.excercise1.checkboxes.CheckBox;
import lab12.factory.abstractfactory.excercise1.factories.GUIFactory;


public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory gui) {
        button = gui.createButton();
        checkBox = gui.creatCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
