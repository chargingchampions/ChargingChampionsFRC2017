package org.usfirst.frc.team6560.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6560.robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Servo;

public class GearMission extends Subsystem {

	public Solenoid solenoid_0 = new Solenoid(RobotMap.Can.SOLENOID_0);
	public Solenoid solenoid_1 = new Solenoid(RobotMap.Can.SOLENOID_1);
	public Solenoid solenoid_2 = new Solenoid(RobotMap.Can.SOLENOID_2);
	public Solenoid solenoid_3 = new Solenoid(RobotMap.Can.SOLENOID_3);
	public Compressor compressor_0 = new Compressor(RobotMap.Can.COMPRESSOR);
	public Servo gearServo = new Servo(RobotMap.Pwm.GEAR_SERVO);
	public boolean gearShiftStatus;
	
	public GearMission() {
		compressor_0.setClosedLoopControl(true);
	}
	
    public void initDefaultCommand() {
    	compressor_0.start();
    	solenoid_0.set(false);
    	solenoid_1.set(false);
    	solenoid_2.set(false);
    	solenoid_3.set(false);
    }
    
    //Gear Mission
    public void openFlaps() {
    	solenoid_0.set(true);
    	solenoid_3.set(true);
    }
    
    public void closeFlaps() {
    	solenoid_0.set(false);
    	solenoid_3.set(false);
    }
    
    public void collectGear() {
    	gearServo.set(1.0);
    }
    
    public void resetServo() {
    	gearServo.set(0.45);
    }
    
    public void pushGear() {
    	solenoid_1.set(true);
    }
    
    public void retract() {
    	solenoid_1.set(false);
    }
    
//    public void test(boolean bool, boolean bool2, boolean bool3, boolean bool4) {
//    	//Tests solenoids 0 - 4 to ensure that they work
//    	solenoid_0.set(bool);
//    	solenoid_1.set(bool2);
//    	solenoid_2.set(bool3);
//    	solenoid_3.set(bool4);
//    }
}

 
