package mta.se.tema.basic;

import mta.se.tema.basic.interfaces.IBattery;
import mta.se.tema.basic.interfaces.IDisplay;
import mta.se.tema.basic.interfaces.IProcessor;
import mta.se.tema.basic.processors.DualCore;
import mta.se.tema.basic.processors.QuadCore;
import mta.se.tema.basic.processors.SingleCore;

/**Class which extends Abstract Factory to generate objects of concrete classes processors
 * @author George Iordache 14/11/2014
 *
 */
public class ProcessorFactory extends AbstractFactory{

	@Override
	IBattery getBatteryCapacity(String battery) {
		return null;
	}

	/**
	 * Overridden method which gets different types of processors based upon given information
	 */
	@Override
	IProcessor getProcessorType(String processor) {
		if(processor==null)
		{
			return null;
		}
		if(processor.equalsIgnoreCase("QUADCORE"))
		{
			return new QuadCore();
		}
		else if(processor.equalsIgnoreCase("DUALCORE"))
		{
			return new DualCore();
		}
		else if(processor.equalsIgnoreCase("SINGLECORE"))
		{
			return new SingleCore();
		}
		return null;
	}

	@Override
	IDisplay getDisplaySize(String display) {
		return null;
	}

}
