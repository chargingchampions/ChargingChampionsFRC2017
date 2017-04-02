package org.usfirst.frc.team6560.robot.commands.autonomous;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6560.robot.commands.CloseFlaps;
import org.usfirst.frc.team6560.robot.commands.DriveStraightBackwardsTime;
import org.usfirst.frc.team6560.robot.commands.DriveStraightTime;
import org.usfirst.frc.team6560.robot.commands.OpenFlaps;
import org.usfirst.frc.team6560.robot.commands.PushGear;
import org.usfirst.frc.team6560.robot.commands.StopDriveTime;
import org.usfirst.frc.team6560.robot.commands.TurnToAngle;

/**
 * Time-based autonomous program that drops gear on right peg
 */
public class CenterPegAutonomous extends CommandGroup {

    public CenterPegAutonomous() {
        //TODO: Implement sensors for more reliable autonomous    	
    	addSequential(new DriveStraightTime(1.5, 0.5));
    	addSequential(new DriveStraightTime(0.45, 0.4));
    	addSequential(new StopDriveTime(0.5));
    	addSequential(new TurnToAngle(1));
    	addSequential(new TurnToAngle(-2));
    	addSequential(new DriveStraightTime(0.5, 0.3));
    	addSequential(new OpenFlaps());
    	Timer.delay(0.1);
    	addSequential(new PushGear(1.0));
    	addParallel(new StopDriveTime(0.5));
    	addParallel(new DriveStraightBackwardsTime(0.2, 0.25));
    	addSequential(new DriveStraightBackwardsTime(0.5, 0.6));
    	addSequential(new CloseFlaps());
    	addSequential(new StopDriveTime(1));
    	
 
    }
}
