package mta.se.tema.basic.processors;

import mta.se.tema.basic.interfaces.IProcessor;

/**Class which implements one type of processor
 * @author George Iordache 14/11/2014
 *
 */
public class SingleCore implements IProcessor{

	/**
	 * Method which overrides the method from IProcessor interface
	 */
	@Override
	public void cores() {
		System.out.println("This device has a SingleCore processor!");
	}

}
