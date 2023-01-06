package lab12.factory.abstractfactory.excercise1.factories;


import lab12.factory.abstractfactory.excercise1.buttons.Button;
import lab12.factory.abstractfactory.excercise1.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox creatCheckBox();
}
