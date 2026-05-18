package tp10.status;

import tp10.GamingMachine;

public class WithAToken extends MachineStatus {

    @Override
    public void pressButton(GamingMachine machine) {
        machine.setStatus(new Playing());
        machine.setPlayers(1);
    }

    @Override
    public void insertToken(GamingMachine machine) {
        machine.setStatus(new WithTwoTokens());
    }
}
