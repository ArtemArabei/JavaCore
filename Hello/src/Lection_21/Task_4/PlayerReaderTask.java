package Lection_21.Task_4;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class PlayerReaderTask implements Callable {

    String path;

    PlayerReaderTask(String path) {
        this.path = path;
    }

    @Override
    public Object call() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(path), "WINDOWS-1251"));
        ObjectMapper objectMapper = new ObjectMapper();
        Players players = objectMapper.readValue(br, Players.class);
        List<Player> filteredPlayers = players.getPlayers().stream()
                .filter((s) -> s.isActive == true && s.getAge() > 24
                        && s.getAge() < 31)
                .collect(Collectors.toList());
        players.setPlayers(filteredPlayers);
        return players;
    }
}
