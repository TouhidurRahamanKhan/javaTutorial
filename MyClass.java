package com.touid.com.defaultInterface;

public class MyClass implements InterfaceA{

	public static void main(String[] args) {
		//The code above shows class MyClass implementing InterfaceA’s method print(). Now lets add a new method called sayHi() to InterfaceA. By doing so, we have introduce a problem to class MyClass as it will not compile until we provide implementation for method sayHi().
		//This is when Defaults methods becomes useful. By Adding the keyword default before the method’s access modifier, we do not have to provide implementation for the method sayHi() in class MyClass.

		//In ‘the strictest sense’, Default methods are a step backwards because they allow you to ‘pollute’ your interfaces with code. But they provide the most elegant and practical way to allow backwards compatibility. It made it much easier for Oracle to update all the Collections classes and for you to retrofit your existing code for Lambda.

		//. The implementation will be used as default if a concrete class does not provide implementation for that method.
	
	  MyClass myClass=new MyClass();
	  myClass.print();
	  myClass.sayHi();
	}

	@Override
	public void print() {
		System.out.println("Hello World");
		
	}

}

