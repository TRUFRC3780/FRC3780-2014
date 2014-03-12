package org.usfirst.frc3780.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.RobotMap;
import org.usfirst.frc3780.components.*;

public class Roller extends Subsystem {
	private Controller rollerDrive;
	
	public Roller() throws ControllerException {
		rollerDrive = Controller.jaguar(RobotMap.INSIDE_ROLLER_ID);
	}
	
	public void driveRoller(double speed) throws ControllerException {
		rollerDrive.set(speed);
	}
	
	public void stop() {
		rollerDrive.stop();
	}
	
	public void initDefaultCommand() {
		
	}
}