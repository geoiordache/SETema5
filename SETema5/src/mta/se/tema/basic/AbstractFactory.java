package mta.se.tema.basic;

import mta.se.tema.basic.interfaces.IBattery;
import mta.se.tema.basic.interfaces.IDisplay;
import mta.se.tema.basic.interfaces.IProcessor;

/**Abstract class to get different factories for Battery,Processor and Display objects
 * @author George Iordache 14/11/2014
 *
 */
public abstract class AbstractFactory {
	/**
	 * Abstract method which will return different battery objects
	 * @param battery
	 * @return one specific battery type
	 */
	abstract IBattery getBatteryCapacity(String battery);
	/**
	 * Abstract method which will return different processor objects
	 * @param processor
	 * @return one specific processor type
	 */
	abstract IProcessor getProcessorType(String processor);
	/**
	 * Abstract method which will return different display objects
	 * @param display
	 * @return one specific display
	 */
	abstract IDisplay getDisplaySize(String display);
}
