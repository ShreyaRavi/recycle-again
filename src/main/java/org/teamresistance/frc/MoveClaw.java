package org.teamresistance.frc;

import org.strongback.command.Command;
import org.strongback.components.Motor;
import org.strongback.components.Switch;

/**
 * Created by shrey on 11/20/2016.
 */
public class MoveClaw extends Command {

    private final Motor clawMotor;
    private final Switch limitSwitch;
    protected double clawSpeed;

    public MoveClaw(Motor clawMotor, Switch limit, double clawSpeed) {
        this.clawMotor = clawMotor;
        this.limitSwitch = limit;
        this.clawSpeed = Math.abs(clawSpeed);
    }

    @Override
    public boolean execute() {
        if (limitSwitch.isTriggered()) {
            clawMotor.stop();
            return true;
        }
        clawMotor.setSpeed(clawSpeed);
        return false;
    }

}
