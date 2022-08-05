package Lection_21.Task_4;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class PlayerGeneratorTask implements Callable {

    int index;

    PlayerGeneratorTask(int index) {
        this.index = index;
    }

    @Override
    public Object call() throws Exception {
        List<Player> p1 = new ArrayList<>();
        Players pl = new Players(p1);
        StringWriter stringPlayers = new StringWriter();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(stringPlayers, pl);
        String pathname = "C:/Users/Artem/IdeaProjects/Hello/src/Lection_21" +
                "/Task_4/ListOfPlayers" + index + ".json";
        objectMapper.writeValue(new File(pathname), pl);
        return pathname;
    }
}

