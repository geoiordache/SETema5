package mta.se.tema.basic.displays;

import mta.se.tema.basic.interfaces.IDisplay;

/**Class which implements one type of display
 * @author George Iordache 14/11/2014
 *
 */
public class SmallSize implements IDisplay{

	/**
	 * Method which overrides the method from IDisplay interface
	 */
	@Override
	public void size() {
		System.out.println("This device has small size display!");
		
	}

}