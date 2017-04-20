package org.usfirst.frc.team6560.robot.commands.autonomous;

import org.usfirst.frc.team6560.robot.commands.DeployGear;
import org.usfirst.frc.team6560.robot.commands.DriveStraightBackwardsTime;
import org.usfirst.frc.team6560.robot.commands.DriveStraightTime;
import org.usfirst.frc.team6560.robot.commands.ResetGear;
import org.usfirst.frc.team6560.robot.commands.StopDriveTime;
import org.usfirst.frc.team6560.robot.commands.TurnToAngle;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Time-based autonomous program that drops gear on left peg
 */
public class LeftPegAutonomous extends CommandGroup {

    public LeftPegAutonomous() {
    	addSequential(new DriveStraightTime(1.48, 0.5));
    	addSequential(new StopDriveTime(1.0));
    	addSequential(new TurnToAngle(40));
    	addSequential(new StopDriveTime(1.0));
    	addSequential(new DriveStraightTime(0.5, 0.5));
    	addSequential(new DriveStraightTime(0.2, 0.2));
    	addSequential(new TurnToAngle(1));
    	addSequential(new TurnToAngle(-2));
    	addSequential(new DriveStraightTime(0.5, 0.2));
    	addSequential(new StopDriveTime(0.4));
    	addSequential(new DeployGear());
    	Timer.delay(0.2);
    	addSequential(new DriveStraightBackwardsTime(0.5, 0.5));
    	addSequential(new ResetGear());
    }
}
