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
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc3780.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
 
    private final Joystick catapultJoystick;
    private final Joystick slingshotJoystick;
    private final Button rollerShootButton;
    private final Button rollerReloadButton;
   
    public OI() {
        catapultJoystick = new Joystick(RobotMap.CATAPULTJOYSTICKPORT);
        slingshotJoystick = new Joystick(RobotMap.SLINGSHOTJOYSTICKPORT);
        
        rollerShootButton = new JoystickButton(catapultJoystick, RobotMap.FIREBUTTONPORT);
        rollerShootButton.whenPressed(new Shoot());
        
        rollerReloadButton = new JoystickButton(catapultJoystick, RobotMap.RELOADBUTTONPORT);
        rollerReloadButton.whenPressed(new Reload());
    }
}

