package org.usfirst.frc3780.components;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;


public class JagRoller extends Roller {
	private final CANJaguar jag;
	
	
	public JagRoller(int deviceNumber) throws CANTimeoutException {
		jag = new CANJaguar(deviceNumber);
	}
	
	// 0-100
	public void set(double speed) throws RollerException {
		try {
			jag.setX(speed / 100);
		}
		catch(CANTimeoutException e) {
			throw new RollerException(e);
		}
	}
	
	public double get() throws RollerException {
		try {
			return jag.getX() * 100;
		} catch(CANTimeoutException e) {
			throw new RollerException(e);
		}
	}
	
}