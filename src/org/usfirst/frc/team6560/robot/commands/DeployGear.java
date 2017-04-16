package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Opens flaps and then pushes gear out
 * 0.1 second delay to avoid gear colliding with flaps
 */
public class DeployGear extends CommandGroup {

    public DeployGear() {
        addSequential(new MoveFlaps(true));
        Timer.delay(0.1);
        addSequential(new PushGear(true));
    }
}
