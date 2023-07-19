package Defaults;

public interface Vehicle {
	
	public void horns();
	
	//static vs default
	/*
	//default access specifier use when we need to make changes in specific class
	
	default void speed() {
		System.out.println("common functinality......");
	}
 
 */
	//static keyword use when we need to put common data for every place
	static void speed() {
		System.out.println("common functinality......");
	}

}
