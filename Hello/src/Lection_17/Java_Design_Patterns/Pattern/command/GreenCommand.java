package Lection_17.Java_Design_Patterns.Pattern.command;

import java.awt.*;

public class GreenCommand extends Command {

    public GreenCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        Color color = new Color(0, 255, 0);
        editor.textField.setForeground(color);
        return false;
    }
}