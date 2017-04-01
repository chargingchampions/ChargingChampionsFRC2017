package org.usfirst.frc.team6560.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6560.robot.commands.DriveStraightBackwardsTime;
import org.usfirst.frc.team6560.robot.commands.DriveStraightTime;
import org.usfirst.frc.team6560.robot.commands.DropGear;
import org.usfirst.frc.team6560.robot.commands.StopDriveTime;
import org.usfirst.frc.team6560.robot.commands.TurnToAngle;

/**
 * Autonomously drives the robot straight to cross the baseline
 */
public class GoStraightAutonomous extends CommandGroup {

    public GoStraightAutonomous() {
    	addSequential(new DriveStraightTime(3.5, 0.4));
 
    }
}
