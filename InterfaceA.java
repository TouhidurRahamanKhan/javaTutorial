package com.touid.com.defaultInterface;



public interface InterfaceA {

	public void  print();
	
	//Note that we have to provide implementation for all default methods
	// So default methods provides us the flexibility to allow methods to be implemented in interfaces.
	default public void sayHi(){
		System.out.println("Hi from  Interface A");
	}
	default public void sayHi2(){
		System.out.println("Hi2 from  Interface A");
	}
}
