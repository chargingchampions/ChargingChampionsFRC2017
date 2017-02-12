package org.usfirst.frc.team6560.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6560.robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Servo;

public class GearMission extends Subsystem {
    /*
     * Solenoids 1 and 2 for Gearbox shifting
     * Solenoids 0 and 3 for Gear Mission
     */
	public Solenoid solenoid_0 = new Solenoid(RobotMap.Can.SOLENOID_0);
	public Solenoid solenoid_1 = new Solenoid(RobotMap.Can.SOLENOID_1);
	public Solenoid solenoid_2 = new Solenoid(RobotMap.Can.SOLENOID_2);
	public Solenoid solenoid_3 = new Solenoid(RobotMap.Can.SOLENOID_3);
	public Solenoid solenoid_4 = new Solenoid(RobotMap.Can.SOLENOID_4);
	public Solenoid solenoid_5 = new Solenoid(RobotMap.Can.SOLENOID_5);
	public Solenoid solenoid_6 = new Solenoid(RobotMap.Can.SOLENOID_6);
	public Solenoid solenoid_7 = new Solenoid(RobotMap.Can.SOLENOID_7);
	public Compressor compressor_0 = new Compressor(RobotMap.Can.COMPRESSOR);

	public AnalogInput ultrasound = new AnalogInput(0);
	public Servo gearServo = new Servo(RobotMap.Pwm.GEAR_SERVO);
	
    public void initDefaultCommand() {
    	compressor_0.start();
    	solenoid_0.set(false);
    	solenoid_1.set(false);
    	solenoid_2.set(false);
    	solenoid_3.set(false);
    	solenoid_4.set(false);
    	solenoid_5.set(false);
    	solenoid_6.set(false);
    	solenoid_7.set(false);
    }
    
    public void dropGear() {
    	solenoid_0.set(true);
    	solenoid_3.set(true);
    }
    
    public void collectGear() {
    	//TODO: Find correct Servo angle
    	gearServo.set(0);
    }
    
    public void test(boolean bool, boolean bool2, boolean bool3, boolean bool4) {
    	//Tests solenoids 0 - 4 to ensure that they work
    	solenoid_0.set(bool);
    	solenoid_1.set(bool2);
    	solenoid_2.set(bool3);
    	solenoid_3.set(bool4);
    }
    
    public void shiftGearsHigh() {
    	solenoid_1.set(true);
    	solenoid_2.set(true);
    }
    
    public void shiftGearsLow() {
    	solenoid_1.set(false);
    	solenoid_2.set(false);
    }
    
}

 
