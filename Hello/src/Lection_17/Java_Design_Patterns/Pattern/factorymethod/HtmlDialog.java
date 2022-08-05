package Lection_17.Java_Design_Patterns.Pattern.factorymethod;


/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
