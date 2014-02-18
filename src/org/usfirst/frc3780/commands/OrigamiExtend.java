package org.usfirst.frc3780.commands;

import edu.wpi.first.wpilibj.*;

public class OrigamiExtend extends CommandBase {
	
	public OrigamiExtend() {
		requires(origami);
	}
	
	public void execute() {
		origami.extendAll();
	}
	
	public boolean isFinished() {
		return origami.isExtended();
	}
	
	public void initialize() {}
	
	public void interrupted() {
		end();
	}
	
	public void end() {
		
	}
}