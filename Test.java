package com.cozentus.AnonymousClass_Thread;

@FunctionalInterface //	This will restrict and make the proper flow for interface execution
//In functional interface, only one abstract method is allowed. Apart from this, default method and static method are 
//allowed in interface
public interface Test {
	
	void cal();
	
	//Default Method
	default void cal1() {
		System.out.println("This is the default method of cal1 !!");
	}
	
	//Static Method
	static void cal2() {
		System.out.println("This is the static method of cal2 !!");
	}
}
