package tp10.status;

import tp10.GamingMachine;

public class Playing extends MachineStatus {
    @Override
    public void gameOver(GamingMachine machine){
        machine.setStatus(new AwaitingToken());
    }
}