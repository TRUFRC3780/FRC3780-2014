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

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.RobotMap;

/**
 * Controls double solenoid powering the Sonic Shifters.
 * @author Brian
 */
public class Shifters extends Subsystem {

    private DoubleSolenoid solenoid;
    
    public Shifters() {
        solenoid = new DoubleSolenoid(RobotMap.SHIFTERS_FORWARD_PORT, RobotMap.SHIFTERS_REVERSE_PORT);
    }
    
    /**
     * Extends the pistons, putting the Sonic Shifters in high gear.
     */
    public void shiftHigh() {
        solenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    /**
     * Retracts the pistons, putting the Sonic Shifters in low gear.
     */
    public void shiftLow() {
        solenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    /**
     * Checks if the Sonic Shifters are in high gear.
     * @return True if shifters are in high.
     */
    public boolean isHigh() {
        return (solenoid.get() == DoubleSolenoid.Value.kReverse) ? true : false;
    }
    
    /**
     * Checks if the Sonic Shifters are in low gear.
     * @return True if shifters are in low.
     */
    public boolean isLow() {
        return (solenoid.get() == DoubleSolenoid.Value.kForward) ? true : false;
    }
    
    public void initDefaultCommand() {
    }
}