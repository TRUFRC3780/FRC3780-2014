/*
* Copyright 2014 FRC3780 (B. Fogarty, E. Rothchild, A. Lee) Licensed under the
* Educational Community License, Version 2.0 (the "License"); you may
* not use this file except in compliance with the License. You may
* obtain a copy of the License at
* 
* http://www.opensource.org/licenses/ECL-2.0
* 
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an "AS IS"
* BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
* or implied. See the License for the specific language governing
* permissions and limitations under the License.
* 
*/

package org.usfirst.frc3780.components;

import edu.wpi.first.wpilibj.*;

/**
 * This is a class for representing pistons. For use with the Origami subsystem.
 * @author Andy
 */
public class Piston {
	// one field, one double solenoid
	private DoubleSolenoid solenoid;
	
	// public constructor takes same input as DoubleSolenoid Constructor
	public Piston(int moduleNumber,int forwardChannel,int reverseChannel) {
		this( new DoubleSolenoid(moduleNumber,forwardChannel,reverseChannel) );
	}
	
	// private constructor takes the solenoid object directly and initializes the field
	private Piston(DoubleSolenoid solenoid) {
		this.solenoid = solenoid;
	}
	
	// toggle extended and retracted
	public void toggle() throws PistonException {
		if( isExtended() ) {
			retract();
		} else {
			extend();
		}
	}
	
	// extend the piston using the solenoid
	public void extend() throws PistonException {
		if( isExtended() ) throw new PistonException("Attempt to extend piston that is already extended: " + this);
		solenoid.set( DoubleSolenoid.Value.kForward );
	}
	
	// retract the piston using the solenoid
	public void retract() throws PistonException {
		if( !isExtended() ) throw new PistonException("Attempt to retract piston that is already retracted" + this);
		solenoid.set( DoubleSolenoid.Value.kReverse );
	}
	
	// return boolean of whether piston is extended
	public boolean isExtended() throws PistonException {
		DoubleSolenoid.Value state = solenoid.get();
		if( state == DoubleSolenoid.Value.kForward ) return true;
		if( state == DoubleSolenoid.Value.kReverse ) return false;
		throw new PistonException("Piston is not in forward or reverse states");
	}
	
}