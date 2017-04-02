package org.usfirst.frc.team6560.robot.subsystems;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
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
    
    private double kP = 0.03;

    /**
     * Calibrates gyro when instance of drive is initialized and sets current angle to 0
     */
    public Drive() {
    	gyro.calibrate();
    	gyro.reset();
    }
    
    /**
     * Drives robot with tank drive with left and right input from joystick
     * @param left	Speed of left side of drivetrain
     * @param right	Speed of right side of drivetrain
     */
    public void driveWithJoysticks(double left, double right) {
    	drivetrain.tankDrive(left, right);
    }
    
    /**
     * Drives robot straight with a given speed by using gyro output to course-correct
     * @param speed	Speed value from -1.0 to 1.0 (Speed will always be positive)
     */
    public void driveStraight(double speed) {
    	speed = Math.abs(speed);
      	int angle = getGyroAngle();
    	drivetrain.drive(speed, -1 * angle * kP);
    }

    /**
     * Drives robot straight backwards with a given speed by using gyro output to course-correct 
     * @param speed	Speed value from -1.0 to 1.0 (Speed with always be positive)
     */
    public void driveStraightBackwards(double speed) {
    	speed = Math.abs(speed);
    	int angle = getGyroAngle();
    	drivetrain.drive(-1 * speed, angle * kP);
    }
    
    /**
     * Drives robot at an angle and speed, using the drive method
     * @param angle	Angle value to turn to
     * @param speed	Speed value from -1.0 to 1.0
     */
    public void driveCurve(int angle, double speed) {
    	drivetrain.drive(speed, angle);
    }
    
    /**
     * Spins robot clockwise at a given speed by driving the left side of the drivetrain
     * forward and the right side backwards
     * @param speed	Speed value from -1.0 to 1.0 (Speed will always be positive)
     */
    public void spinRight(double speed) {
    	speed =  Math.abs(speed);
    	leftTopMotor.set(speed);
    	leftBottomMotor.set(speed);
    	rightTopMotor.set(speed);
    	rightBottomMotor.set(speed);
    }
    
    /**
     * Spins robot counterclockwise at a given speed by driving the right side of the 
     * drivetrain forward and the left side backwards
     * @param speed	Speed value from -1.0 to 1.0 (Speed will always be positive)
     */
    public void spinLeft(double speed) {
    	speed = Math.abs(speed);
    	leftTopMotor.set(-1 * speed);
    	leftBottomMotor.set(-1 * speed);
    	rightTopMotor.set(-1 * speed);
    	rightBottomMotor.set(-1 * speed);
    }
    
    /**
     * Returns the current gyro angle
     * @return the current gyro angle
     */
    public int getGyroAngle() {
    	return (int)Math.round(gyro.getAngle());
    }
    
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
