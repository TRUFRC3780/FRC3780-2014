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


public class JagController extends Controller {
	private final CANJaguar jag;
	
	
	public JagController(int deviceNumber) throws ControllerException {
		try {
			jag = new CANJaguar(deviceNumber);
		} catch(CANTimeoutException e) {
			throw new ControllerException(e);
		} 
	}
	
	// -100-100
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