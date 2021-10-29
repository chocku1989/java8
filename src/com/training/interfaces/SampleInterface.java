package com.training.interfaces;

public interface SampleInterface {

	public static final float sal=200.0f;
	public int size();
	
	public default int getCount() {
		System.out.println("indie get count SampleInterface");
		return 100;
	}
	
	public static void getItems(){
		System.out.println("inside getItems ");
	}
	
	public void test() ;
}
