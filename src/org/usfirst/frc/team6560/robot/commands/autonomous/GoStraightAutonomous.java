package org.usfirst.frc.team6560.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team6560.robot.commands.DriveStraightTime;

/**
 * Autonomously drives the robot straight to cross the baseline. Used for emergency
 */
public class GoStraightAutonomous extends CommandGroup {

    public GoStraightAutonomous() {
    	addSequential(new DriveStraightTime(3.5, 0.4));
    }
}
