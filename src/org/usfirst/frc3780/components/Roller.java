package org.usfirst.frc3780.components;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;


public abstract class Roller {
	
	public abstract void set(double speed) throws RollerException;
	public abstract double get() throws RollerException;
	
	
	public void forward(double speed) throws RollerException {
		checkSpeed(speed);
		set(speed);
	}
	
	public void backward(double speed) throws RollerException {
		checkSpeed(speed);
		set( -speed );
	}
	
	public void stop() {
		set(0);
	}
	
	
	public static Roller victor(int channel) {
		return new VictorRoller( channel );
	}
	
	public static Roller victor(int slot,int channel) {
		return new VictorRoller( slot,channel );
	}
	
	public static Roller jaguar( int deviceNumber ) throws CANTimeoutException {
		return new JagRoller( deviceNumber );
	}
	
	private void checkSpeed(double speed) throws RollerException {
		if( speed < 0 || speed > 100 ) throw new RollerException("Speed must be between 0 and 100. Invalid speed: " + speed);
	}
	
}