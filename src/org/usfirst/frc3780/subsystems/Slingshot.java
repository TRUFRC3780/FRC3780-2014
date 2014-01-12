/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc3780.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.RobotMap;
/**
 *
 * @author Owner1
 */
public class Slingshot extends Subsystem{
    
     private CANJaguar slingJag;
    
    public Slingshot() throws CANTimeoutException {
        slingJag = new CANJaguar(RobotMap.SLINGJAGID);
    }
    
    public void initDefaultCommand(){
        
    }
    
    public void motorForward() {
        
    }
    
    public void motorBackwards(){
        
    }
    
}
