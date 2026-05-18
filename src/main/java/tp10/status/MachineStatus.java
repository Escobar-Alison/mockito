package tp10.status;

import tp10.GamingMachine;

public abstract class MachineStatus {
    public void pressButton(GamingMachine machine) {}
    public void insertToken(GamingMachine machine) {}
    public void gameOver(GamingMachine machine)    {}
}
