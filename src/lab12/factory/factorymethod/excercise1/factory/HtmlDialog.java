package lab12.factory.factorymethod.excercise1.factory;


import lab12.factory.factorymethod.excercise1.buttons.Button;
import lab12.factory.factorymethod.excercise1.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
