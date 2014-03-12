package org.usfirst.frc3780.components;

import edu.wpi.first.wpilibj.*;

public class TalonController extends Controller {
	private Talon talon;
	
	public TalonController(int channel) {
		talon = new Talon(channel);
	}
	
	public TalonController(int slot, int channel) {
		talon = new Talon(slot,channel);
	}
	// -100-100
	public double get() {
		return talon.get() * 100;
	}
	
	public void set(double speed) {
		talon.set(speed/100);
	}
}