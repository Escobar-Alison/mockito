package tp10;

import tp10.status.AwaitingToken;
import tp10.status.MachineStatus;

public class GamingMachine {
    private MachineStatus status;
    private int players;


    public GamingMachine() {
        this.status = new AwaitingToken();
        this.players = 0;
    }

    public void setStatus(MachineStatus status) { this.status    = status; }
    public MachineStatus getStatus() { return status;}

    public void setPlayers(int players) { this.players = players; }
    public int getPlayers() { return players ;}

    public void pressButton() {
        status.pressButton(this);
    }

    public void insertToken() {
        status.insertToken(this);
    }

    public void gameOver() {
        status.gameOver(this);
    }

}
