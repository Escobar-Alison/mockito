package tp10.status;

import tp10.GamingMachine;

public class AwaitingToken extends MachineStatus {
    @Override
    public void pressButton(GamingMachine machine) {
        //insert token to start game
    }

    @Override
    public void insertToken(GamingMachine machine) {
        machine.setStatus(new WithAToken());
    }
}
