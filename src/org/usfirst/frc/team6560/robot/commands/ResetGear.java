package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Retracts pusher and closes flaps concurrently
 */
public class ResetGear extends CommandGroup {

    public ResetGear() {
    	addSequential(new PushGear(false));
    	addSequential(new MoveFlaps(false));
    }
}
