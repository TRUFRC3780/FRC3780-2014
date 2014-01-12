/*
* Copyright 2014 FRC3780 (Brian Fogarty) Licensed under the
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

package org.usfirst.frc3780.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.RobotMap;

/**
 *
 * @author Eric
 */
public class Winch extends Subsystem {
    
     private CANJaguar winchJag;
     
     public Winch() throws CANTimeoutException {
        winchJag = new CANJaguar(RobotMap.WINCHJAGID);
    }
    
    public void initDefaultCommand(){
        
    }
    
    public void motorForward() {
        
    }
    
    public void motorBackwards(){
        
    }
    
}
