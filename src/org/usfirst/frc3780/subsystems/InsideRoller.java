package org.usfirst.frc3780.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.components.*;
import static org.usfirst.frc3780.RobotMap.*;

public class InsideRoller extends Subsystem {
	private Roller rollerDrive;
	
	public InsideRoller() throws RollerException {
		rollerDrive = Roller.jaguar(INSIDE_ROLLER_ID);
	}
	
	public void driveRoller(double speed) throws RollerException {
		rollerDrive.set(speed);
	}
	
	public void stop() {
		rollerDrive.stop();
	}
	
	public void initDefaultCommand() {
		
	}
}