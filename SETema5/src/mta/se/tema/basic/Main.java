package mta.se.tema.basic;

import mta.se.tema.basic.interfaces.IBattery;
import mta.se.tema.basic.interfaces.IDisplay;
import mta.se.tema.basic.interfaces.IProcessor;

/**The entry point to the application
 * Testing Abstract Factory design pattern
 * @author George Iordache 14/11/2014
 */

public class Main {

	/**The entry point to the project
	 * @param args The arguments to the executable
	 */
	public static void main(String[] args) {
		//get display factory
		AbstractFactory displayFactory=FactoryProducer.getFactory("display");
		
		//get battery factory
		AbstractFactory batteryFactory=FactoryProducer.getFactory("battery");
		
		//get processor factory
		AbstractFactory processorFactory=FactoryProducer.getFactory("processor");
		
		System.out.println("Types of displays created:");
		//get objects with different displays
		IDisplay display1=displayFactory.getDisplaySize("small");
		IDisplay display2=displayFactory.getDisplaySize("big");
		IDisplay display3=displayFactory.getDisplaySize("hd");
		//show the displays created
		display1.size();
		display2.size();
		display3.size();
		System.out.println();
		
		System.out.println("Types of batteries created:");
		//get objects with different batteries
		IBattery battery1=batteryFactory.getBatteryCapacity("low");
		IBattery battery2=batteryFactory.getBatteryCapacity("good");
		IBattery battery3=batteryFactory.getBatteryCapacity("high");
		//show the batteries created
		battery1.capacity();
		battery2.capacity();
		battery3.capacity();
		System.out.println();
		
		System.out.println("Types of processors created:");
		//get objects with different processors
		IProcessor processor1=processorFactory.getProcessorType("singlecore");
		IProcessor processor2=processorFactory.getProcessorType("dualcore");
		IProcessor processor3=processorFactory.getProcessorType("quadcore");
		//show the processors created
		processor1.cores();
		processor2.cores();
		processor3.cores();
		System.out.println();
		
	}

}
