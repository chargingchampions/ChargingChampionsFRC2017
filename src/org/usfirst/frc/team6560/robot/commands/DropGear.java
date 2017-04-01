package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Opens flaps, pushes gear out, then closes flaps on gear subsystem
 */
public class DropGear extends CommandGroup {

    public DropGear() {
    	addSequential(new OpenFlaps());
    	addSequential(new PushGear(0.8));
    	addSequential(new CloseFlaps());
    }
}
