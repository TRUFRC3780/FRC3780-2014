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
import edu.wpi.first.wpilibj.can.*;


public abstract class Controller {
	// -100-100
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
	
	public void stop() throws ControllerException {
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
	
	public static Controller talon(int channel) {
		return new TalonController(channel);
	}
	
	public static Controller talon(int slot, int channel) {
		return new TalonController(slot,channel);
	}
	
	private void checkSpeed(double speed) throws ControllerException {
		if( speed < 0 || speed > 100 ) throw new ControllerException("Speed must be between 0 and 100. Invalid speed: " + speed);
	}
	
}