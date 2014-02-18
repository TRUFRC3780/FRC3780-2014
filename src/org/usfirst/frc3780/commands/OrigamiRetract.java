package org.usfirst.frc3780.commands;

import edu.wpi.first.wpilibj.*;

public class OrigamiRetract extends CommandBase {
	public void execute() {
		origami.retractAll();
	}
	
	public boolean isFinished() {
		return !origami.isExtended();
	}
	
	public void initialize() {}
	public void interrupted() {
		end();
	}
	public void end() {}
}