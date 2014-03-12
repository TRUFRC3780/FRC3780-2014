package org.usfirst.frc3780.components;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;


public class JagController extends Controller {
	private final CANJaguar jag;
	
	
	public JagController(int deviceNumber) throws ControllerException {
		try {
			jag = new CANJaguar(deviceNumber);
		} catch(CANTimeoutException e) {
			throw new ControllerException(e);
		} 
	}
	
	// 0-100
	public void set(double speed) throws ControllerException {
		try {
			jag.setX(speed / 100);
		}
		catch(CANTimeoutException e) {
			throw new ControllerException(e);
		}
	}
	
	public double get() throws ControllerException {
		try {
			return jag.getX() * 100;
		} catch(CANTimeoutException e) {
			throw new ControllerException(e);
		}
	}
	
}