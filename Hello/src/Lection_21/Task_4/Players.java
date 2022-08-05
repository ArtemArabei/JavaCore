package Lection_21.Task_4;

import java.util.List;
import java.util.Random;

public class Players {

    private List<Player> players;

    public Players() {
    }

    Players(List<Player> players) {
        this.players = players;
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            players.add(new Player("A" + i, (int) (Math.random() * 21) + 20,
                    rd.nextBoolean()));
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
