package org.usfirst.frc.team6560.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6560.robot.commands.DriveStraightBackwardsTime;
import org.usfirst.frc.team6560.robot.commands.DriveStraightTime;
import org.usfirst.frc.team6560.robot.commands.DropGear;
import org.usfirst.frc.team6560.robot.commands.StopDriveTime;
import org.usfirst.frc.team6560.robot.commands.TurnToAngle;

/**
 * Autonomously commands the robot to drive forward from the central driver station
 * and places the peg on the central lift. Entirely based on time
 *
 * Approx 50% success rate. Driving straight is an issue. Runs in 3.5 +- 0.1 seconds
 */
public class CenterPegAutonomous extends CommandGroup {

    public CenterPegAutonomous() {
        //TODO: Implement sensors for more reliable autonomous
    	addSequential(new DriveStraightTime(0.7, 0.6));
    	addSequential(new DriveStraightTime(0.45, 0.3));
    	addSequential(new StopDriveTime(0.5));
    	addSequential(new TurnToAngle(1));
    	addSequential(new TurnToAngle(-2));
    	addSequential(new DriveStraightTime(0.5, 0.3));
    	addSequential(new DropGear());
    	addSequential(new StopDriveTime(0.5));
    	addSequential(new DriveStraightBackwardsTime(0.5, 0.6));
    	addSequential(new StopDriveTime(1));
    }
}
