package org.usfirst.frc3780.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.RobotMap;
import org.usfirst.frc3780.components.*;

public class Arm extends Subsystem {
	Roller armDrive;
	
	public Arm() throws RollerException {
		armDrive = Roller.jaguar(RobotMap.ARM_DRIVE_ID);
	}
	
	public void driveArm(double speed) throws RollerException {
		armDrive.set(speed);
	}
	
	public void stop() {
		armDrive.stop();
	}
	
	public void initDefaultCommand() {
		
	}
	
}