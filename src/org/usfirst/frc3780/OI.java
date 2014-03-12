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

package org.usfirst.frc3780;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc3780.commands.*;
import org.usfirst.frc3780.subsystems.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    private final Joystick driveJoystick, operatorJoystick;
    
    private final JoystickButton toggleArm, toggleRoller;
    
    public OI(){
        
        driveJoystick = new Joystick(RobotMap.DRIVE_JOYSTICK_PORT);
        operatorJoystick = new Joystick(RobotMap.OPERATOR_JOYSTICK_PORT);
        
        toggleArm = new JoystickButton(operatorJoystick, RobotMap.TOGGLE_ARM_BUTTON_PORT);
        toggleArm.whenPressed(new DriveArm());
        
        toggleRoller = new JoystickButton(operatorJoystick, RobotMap.TOGGLE_ROLLER_BUTTON_PORT);
        toggleRoller.whenPressed(new DriveRoller());
        
    }
    
    /**
     * Returns the drive joystick.
     * @return Drive joystick.
     */
    public Joystick getDriveJoystick() {
        return driveJoystick;
    }
    
    /**
     * Returns the operator joystick.
     * @return Operator joystick.
     */
    public Joystick getOperatorJoystick() {
        return operatorJoystick;
    }
    
}

