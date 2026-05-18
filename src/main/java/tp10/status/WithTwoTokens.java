package tp10.status;

import tp10.GamingMachine;

public class WithTwoTokens extends MachineStatus {

    @Override
    public void pressButton(GamingMachine machine) {
        machine.setStatus(new Playing());
        machine.setPlayers(2);
    }
}
