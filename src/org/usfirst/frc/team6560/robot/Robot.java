package org.usfirst.frc.team6560.robot;

import org.usfirst.frc.team6560.robot.commands.autonomous.*;
import org.usfirst.frc.team6560.robot.subsystems.*;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	public static OI oi;

	//Subsystems
	public static Drive drive;
	public static GearMission gearMission;
	public static Hanger hanger;
	public static UsbCamera gearCamera;
	
	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();
	
    public void robotInit() {
    	drive = new Drive();
		gearMission = new GearMission();	
		hanger = new Hanger();
		oi = new OI();
		gearCamera = CameraServer.getInstance().startAutomaticCapture();
		chooser.addDefault("Center Gear Auto", new CenterPegAutonomous());
		chooser.addObject("Left Gear Auto", new LeftPegAutonomous());
		chooser.addObject("Right Gear Auto", new RightPegAutonomous());
		chooser.addObject("Go Straight Auto", new GoStraightAutonomous());
		chooser.addObject("Do Nothing Auto", null);
		SmartDashboard.putData("Autonomous Mode Chooser", chooser);
    }
	
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
    	autonomousCommand = chooser.getSelected();
    	if(autonomousCommand != null) {
    		autonomousCommand.start();
    	}
    
    }
    public void autonomousPeriodic() {
    	SmartDashboard.putNumber("Gyro Angle", drive.getGyroAngle());
    	Scheduler.getInstance().run();
        //SmartDashboard.putNumber("Ultrasonic Distance", drive.ultra.getRangeInches());
    }

    public void teleopInit() {
    	if(autonomousCommand != null)
    		autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
    	SmartDashboard.putNumber("Gyro Angle", drive.getGyroAngle());
        Scheduler.getInstance().run();
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
