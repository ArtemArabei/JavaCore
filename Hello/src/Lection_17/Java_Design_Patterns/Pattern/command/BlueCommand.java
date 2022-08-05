package Lection_17.Java_Design_Patterns.Pattern.command;

import java.awt.*;

public class BlueCommand extends Command {

    public BlueCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        Color color = new Color(0, 0, 255);
        editor.textField.setForeground(color);
        return false;
    }
}
