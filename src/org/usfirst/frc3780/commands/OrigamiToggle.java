package org.usfirst.frc3780.commands;

import edu.wpi.first.wpilibj.*;

// This command is a bit iffy compared with the other two
public class OrigamiToggle extends CommandBase {
	private boolean initialState = origami.isExtended();
	
	public void execute() {
		origami.toggleAll();
	}
	
	public boolean isFinished() {
		return initialState != origami.isExtended();
	}
	
	
	public void initialize() {}
	public void interrupted() {
		end();
	}
	public void end() {}
}