package org.usfirst.frc.team6560.robot.subsystems;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Ultrasonic;

import org.usfirst.frc.team6560.robot.RobotMap.Can;
import org.usfirst.frc.team6560.robot.commands.DriveWithJoysticks;

public class Drive extends Subsystem {
    CANTalon leftTopMotor = new CANTalon(Can.LEFT_FWD_MOTOR);
    CANTalon leftBottomMotor = new CANTalon(Can.LEFT_REAR_MOTOR);
    CANTalon rightTopMotor = new CANTalon(Can.RIGHT_FWD_MOTOR);
    CANTalon rightBottomMotor = new CANTalon(Can.RIGHT_REAR_MOTOR);
    public RobotDrive drivetrain = new RobotDrive(leftTopMotor, leftBottomMotor, rightTopMotor, rightBottomMotor);
    public ADXRS450_Gyro gyro = new ADXRS450_Gyro();
    public Ultrasonic ultra = new Ultrasonic(0, 1);
    private final double kP = 0.1; //Proportional scaling constant

    /**
     * Calibrates gyro when initialized and sets current angle to 0
     */
    public Drive() {
    	gyro.calibrate();
    	gyro.reset();
    }
    
    /**
     * Drives robot with tank drive with two input values
     * 
     * @param left	Input value corresponding to speed of left side of drivetrain
     * @param right	Input value corresponding to speed of right side of drivetrain
     */
    public void driveWithJoysticks(double left, double right) {
    	drivetrain.tankDrive(left, right);
    }
    
    /**
     * Drives robot straight with an input speed, using gyro output to course-correct
     * 
     * @param speed	Input value corresponding to speed value from -1.0 to 1.0 (Speed will always be positive)
     */
    public void driveStraight(double speed) {
    	speed = Math.abs(speed);
      	int angle = getGyroAngle();
    	drivetrain.drive(speed, -1 * angle * kP);
    }

    /**
     * Drives robot straight backwards with an input speed, using gyro output to course-correct 
     * 
     * @param speed	Input value corresponding to speed value from -1.0 to 1.0 (Speed with always be positive)
     */
    public void driveStraightBackwards(double speed) {
    	speed = Math.abs(speed);
    	int angle = getGyroAngle();
    	drivetrain.drive(-1 * speed, angle * kP);
    	Timer.delay(0.005);
    }
    
    /**
     * Drives robot at an input angle and speed, using the drive method
     * 
     * @param angle	Input value corresponding to angle value to turn to
     * @param speed	Input value corresponding to speed value from -1.0 to 1.0
     */
    public void driveCurve(int angle, double speed) {
    	drivetrain.drive(speed, angle);
    }
    
    /**
     * Spins robot clockwise at an input speed by driving the left side of the drivetrain
     * forward and the right side backwards
     * 
     * @param speed	Input value corresponding to speed value from -1.0 to 1.0 (Speed will always be positive)
     */
    public void spinRight(double speed) {
    	speed =  Math.abs(speed);
    	leftTopMotor.set(speed);
    	leftBottomMotor.set(speed);
    	rightTopMotor.set(speed);
    	rightBottomMotor.set(speed);
    }
    
    /**
     * Spins robot counterclockwise at an input speed by driving the right side of the 
     * drivetrain forward and the left side backwards
     * 
     * @param speed	Input value corresponding to speed value from -1.0 to 1.0 (Speed will always be positive)
     */
    public void spinLeft(double speed) {
    	speed = Math.abs(speed);
    	leftTopMotor.set(-1 * speed);
    	leftBottomMotor.set(-1 * speed);
    	rightTopMotor.set(-1 * speed);
    	rightBottomMotor.set(-1 * speed);
    }
    
    /**
     * Rounds the current gyro heading as an integer and returns it
     * 
     * @return the current gyro angle as an int
     */
    public int getGyroAngle() {
    	return (int)Math.round(gyro.getAngle());
    }
    
    /**
     * Stops all drive
     */
    public void stop() {
    	leftTopMotor.set(0);
    	leftBottomMotor.set(0);
    	rightTopMotor.set(0);
    	rightBottomMotor.set(0);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoysticks());
    }
}
