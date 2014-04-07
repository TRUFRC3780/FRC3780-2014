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

// The class for piston exceptions, thrown by the Piston class
package org.usfirst.frc3780.components;

public class PistonException extends RuntimeException {
	public PistonException() {}
	public PistonException(String msg) {}
	public PistonException(Exception cause) {}
	
	
}