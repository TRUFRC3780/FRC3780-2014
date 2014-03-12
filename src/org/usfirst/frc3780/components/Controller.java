package org.usfirst.frc3780.components;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;


public abstract class Controller {
	
	public abstract void set(double speed) throws ControllerException;
	public abstract double get() throws ControllerException;
	
	
	public void forward(double speed) throws ControllerException {
		checkSpeed(speed);
		set(speed);
	}
	
	public void backward(double speed) throws ControllerException {
		checkSpeed(speed);
		set( -speed );
	}
	
	public void stop() {
		set(0);
	}
	
	
	public static Controller victor(int channel) {
		return new VictorController( channel );
	}
	
	public static Controller victor(int slot,int channel) {
		return new VictorController( slot,channel );
	}
	
	public static Controller jaguar( int deviceNumber ) throws ControllerException {
		return new JagController( deviceNumber );
	}
	
	private void checkSpeed(double speed) throws ControllerException {
		if( speed < 0 || speed > 100 ) throw new ControllerException("Speed must be between 0 and 100. Invalid speed: " + speed);
	}
	
}